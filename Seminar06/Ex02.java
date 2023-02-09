import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Ex02 {
    /*
    Напишите метод, который заполнит массив из 1000 элементов случайными
цифрами от 0 до 24.
2. Создайте метод, в который передайте заполненный выше массив и с
помощью Set вычислите процент уникальных значений в данном массиве и
верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее
количество чисел в массиве.
     */
    public static void main(String[] args) {
        Integer[] arr = FillMas();
         //PrintMas(arr);
         HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
         System.out.println(set);
        System.out.println(set.size());
         System.out.println(set.size()*100.0/arr.length);
    }

    public static Integer[] FillMas() {
        Integer[] arr = new Integer[100];
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
