import java.util.*;

public class Task3 {
    /*
     Реализовать алгоритм пирамидальной сортировки (HeapSort).
     */
    public static void main(String[] args) {
        int[] array = fillArray();

        long start = System.nanoTime();
        System.out.print("Origin array: ");
        printArray(array);          // Печатаем оригинальный массив
        int [] arr = array.clone();
        sort(array);                     // Соритруем

        System.out.print("Sorted array: ");
        printArray(array);      // Печатаем сортированный массив
        long end = System.nanoTime();
        long a = end - start;
        System.out.println("Time in nano sec: " + a);

        System.out.println();
        long start2 = System.nanoTime();
        Arrays.sort(arr);        // Встроенная сортировка для наглядности
        printArray(arr);
        long end2 = System.nanoTime();
        long b = end2 - start2;
        System.out.println("Time in nano sec: " + b);

    }

    public static int[] fillArray() {
        int length = 10;
        int [] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int rand = random.nextInt(10);
            array[i] = rand;
        }
        return array;
    }

    public static void sort(int [] arr) {
        int n = arr.length;

        // Строим кучу.
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Извлекаем элементы из кучи.
        for (int i = n - 1; i >= 0; i--) {
            // Перемещаем текущую в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // Вызываем процедуру heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }


    // Для кучи поддерева, укорененного в узле i, который является индексом в arr[], n- размер кучи
    static void heapify(int [] arr, int n, int i) {

        int largest = i;
        int l = 2 * i + 1; // Левый
        int r = 2 * i + 2; // Правый
        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(arr, n, largest);
        }

    }


    public static void printArray(int [] arr)
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
