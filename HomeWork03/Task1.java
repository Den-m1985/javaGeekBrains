import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Task1 {
    /*
    Реализовать алгоритм сортировки слиянием
     */
    public static void main(String[] args) {

        List<Integer> array = FillList();
        PrintList(array);
        PrintList(sortMerge(array));

        int[] arr = {2,3,6,5,9,8,4,2,2,1};
        int [] temp = mergeSort(arr);
        for (int x: temp) {
            System.out.print(x + " ");
        }
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


    public static int[] mergeSort(int[] src) {
        if (src.length <= 1) return src;
        int[] left = Arrays.copyOfRange(src, 0, src.length / 2);
        //for (int x:left) {
            //System.out.print(x + " ");
        //}
        //System.out.println();
        int[] right = Arrays.copyOfRange(src, left.length, src.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int resIn = 0, leftIn = 0, rightIn = 0;
        int[] result = new int[left.length + right.length];

        while (leftIn < left.length && rightIn < right.length)
            if (left[leftIn] < right[rightIn])
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];

        while (resIn < result.length)
            if (leftIn != left.length)
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];

        return result;
    }






    public static List<Integer> sortMerge(List<Integer> arrayA) {
        //https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D1%81%D0%BB%D0%B8%D1%8F%D0%BD%D0%B8%D0%B5%D0%BC
        List<Integer> arrayLeft = new ArrayList<>();
        List<Integer> arrayRight = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int lengthArrayA = arrayA.size();


        if (lengthArrayA == 1 || lengthArrayA == 0) return arrayA;
        //if len(A) == 1 or len(A) == 0:
        //return A


        for (int i = 0; i < lengthArrayA/2; i++) {
            arrayLeft.add(arrayA.get(i));
        }
        //arrayLeft. (sortMerge(arrayA.get(lengthArrayA/2)));
        for (int i = lengthArrayA / 2; i < lengthArrayA; i++) {
            arrayRight.add(arrayA.get(i));
        }
        arrayLeft = sortMerge(arrayLeft); // левая часть возврат из рекурсии строкой return arrayA;
        arrayRight = sortMerge(arrayRight); // правая часть возврат из рекурсии строкой return arrayA;
        //L = merge_sort(A[:len(A) // 2])
        //R = merge_sort(A[len(A) // 2:])
        /*
        for (Integer x: arrayLeft) {
            System.out.print(x + " x");
        }
        System.out.println();
        */
        int n = 0, m = 0, k = 0;
        //n = m = k = 0


        //C = [0] * (len(L) + len(R)) //?????

        while (n < arrayLeft.size() && m < arrayRight.size()){
            if (arrayLeft.get(n) <= arrayRight.get(m)){
                temp.add(arrayLeft.get(n));
                n += 1;
            }
            //while n < len(L) and m < len(R):
            //if L[n] <= R[m]:
            //C[k] = L[n]
            //n += 1
            else {
                temp.add(arrayRight.get(m));
                m += 1;
                k += 1;
            }
            //else:
            //C[k] = R[m]
            //m += 1
            //k += 1
        }
        while (n < arrayLeft.size()){
            temp.add(arrayLeft.get(n));
            n += 1;
            k += 1;
            //while n < len(L):
            //C[k] = L[n]
            //n += 1
            //k += 1
        }
        while (m < arrayRight.size()){
            temp.add(arrayRight.get(m));
            m += 1;
            k += 1;
            /* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! Где-то в этом месте
            for (int i = 0; i < lengthArrayA; i++) {
                arrayA.add(temp.get(i));
            }*/
            //while m < len(R):
            //C[k] = R[m]
            //m += 1
            //k += 1
            //for i in range(len(A)):
            //A[i] = C[i]


        }

        //return A


        return arrayA;
    }


}

