import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Task1 {
    /*
    Реализовать алгоритм сортировки слиянием
    https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D1%81%D0%BB%D0%B8%D1%8F%D0%BD%D0%B8%D0%B5%D0%BC
     */
    public static void main(String[] args) {

        List<Integer> array = FillList();
        System.out.println("Origin array:");
        PrintList(array);
        System.out.println();
        System.out.println("Sort array merge method:");
        PrintList(sortMerge(array));

    }


    public static List<Integer> FillList() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int rand = random.nextInt(10);
            list.add(rand);
        }
        return list;
    }


    public static void PrintList(List<Integer> list) {
        for (Integer x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }


    public static List<Integer> sortMerge(List<Integer> arrayA) {

        List<Integer> arrayLeft = new ArrayList<>();
        List<Integer> arrayRight = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int lengthArrayA = arrayA.size();

        if (lengthArrayA == 1 || lengthArrayA == 0) return arrayA;

        for (int i = 0; i < lengthArrayA/2; i++) {
            arrayLeft.add(arrayA.get(i));
        }
        for (int i = lengthArrayA / 2; i < lengthArrayA; i++) {
            arrayRight.add(arrayA.get(i));
        }


        arrayLeft = sortMerge(arrayLeft); // левая часть возврат из рекурсии строкой return arrayA;
        arrayRight = sortMerge(arrayRight); // правая часть возврат из рекурсии строкой return arrayA;


        int n = 0, m = 0, k = 0;
        while (n < arrayLeft.size() && m < arrayRight.size()){
            if (arrayLeft.get(n) <= arrayRight.get(m)){
                temp.add(arrayLeft.get(n));
                n += 1;
            }
            else {
                temp.add(arrayRight.get(m));
                m += 1;
                k += 1;
            }
        }
        while (n < arrayLeft.size()){
            temp.add(arrayLeft.get(n));
            n += 1;
            k += 1;
        }
        while (m < arrayRight.size()){
            temp.add(arrayRight.get(m));
            m += 1;
            k += 1;
        }
        return temp;
    }


}

