import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex01 {
    /*
    лямбда функции https://metanit.com/java/tutorial/9.1.php
    compare https://metanit.com/java/tutorial/5.6.php
    классы https://metanit.com/java/tutorial/3.1.php
     */

        public static void main(String[] args) {
            /*
            1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
            Распечатайте содержимое данного множества.
            2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
            Распечатайте содержимое данного множества.
            3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
            Распечатайте содержимое данного множества.
             */

             Integer[] arr = {1, 2, 4, 5, 3, 2, 4, 5, 6, 3};
            // HashSet простыми словами это если ты хочешь избавится от повторений.
             HashSet<Integer> set1 = new HashSet<>(Arrays.asList(arr));
             set1.add(10);
             set1.remove(5);
             Iterator<Integer> iterator = set1.iterator();
             while(iterator.hasNext()){
                 System.out.print(iterator.next() + " ");   // 1 2 3 4 6 10
             }

            System.out.println();

            //LinkedHashSet сохраняет порядок добавления.
             LinkedHashSet<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
             Iterator<Integer> iterator2 = set2.iterator();
             while(iterator2.hasNext()){
                 System.out.print(iterator2.next() + " ");// 1 2 4 5 3 6
             }

             System.out.println();

             // Встроенная сортировка по возрастанию.
             TreeSet<Integer> set3 = new TreeSet<>(Arrays.asList(arr));
             Iterator<Integer> iterator3 = set3.iterator();
             while(iterator3.hasNext()){
                 System.out.print(iterator3.next() + " ");  // 1 2 3 4 5 6
             }



            // Integer[] arr = FillMas();
            // //PrintMas(arr);
            // HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
            // System.out.println(set);
            // System.out.println(set.size()*100.0/arr.length);
        }

        public static Integer[] FillMas() {
            Integer[] arr = new Integer[1000];
            for (int i = 0; i < arr.length; i++) {
                Random random = new Random();
                arr[i] = random.nextInt(25);
            }
            return arr;
        }
        public static void PrintMas(Integer[] arr) {
            for (int i : arr) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

}
