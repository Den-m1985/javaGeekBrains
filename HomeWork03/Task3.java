import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    /*
    Задан целочисленный список ArrayList.
    Найти минимальное, максимальное и среднее ариф из этого списка.
     */
    public static void main(String[] args) {
        List<Integer> array = FillList();
        int lenght = array.size();
        PrintList(array);
        findMax(array, lenght);
        findMin(array, lenght);
        findAverage(array, lenght);

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

    public static void findMax(List<Integer> list, int size){
        int max = list.get(0);
        for (int i = 0; i < size; i++) {
            if (max < list.get(i))
                max = list.get(i);
        }
        System.out.println("Max number of array: " + max);
    }
    public static void findMin(List<Integer> list, int size) {
        int min = list.get(0);
        for (int i = 0; i < size; i++) {
            if (min > list.get(i))
                min = list.get(i);
        }
        System.out.println("Min number of array: " + min);
    }
    public static void findAverage(List<Integer> list, int size) {
        double average = 0;
        for (int i = 0; i < size; i++) {
            average += list.get(i);
        }
        System.out.println("Average number of array: " + (average/size));
    }

}
