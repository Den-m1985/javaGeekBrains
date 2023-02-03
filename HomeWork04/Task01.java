import java.util.*;

public class Task01 {
    /*
    Пусть дан LinkedList с несколькими элементами.
    Реализуйте метод, который вернет “перевернутый” список.
     */
    public static void main(String[] args) {
        int lengthArray = 10;
        List<Integer> list = FillLinkedList(lengthArray);

        long start = System.nanoTime();
        System.out.println("Origin array");
        PrintList(list);
        reverseList(list);
        //System.out.println();
        System.out.println("Revers array");
        PrintList(list);
        long end = System.nanoTime();
        long a = end - start;
        System.out.println("Time in nano sec: " + a);

        System.out.println();

        start = System.nanoTime();
        System.out.println("Origin array");
        PrintList(list);
        Collections.reverse(list);
        System.out.println("Revers array");
        PrintList(list);
        end = System.nanoTime();
        long b = end - start;
        System.out.println("Time in nano sec: " + b);


        long c = b*100/a;
        System.out.println(c+ "%");
    }

    public static List<Integer> FillLinkedList(int lengthArray) {
        List<Integer> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < lengthArray; i++) {
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

    public static List<Integer> reverseList(List<Integer> arr) {

        int lenght = arr.size();
        Integer temp = 0;
        for (int i = 0; i < lenght/2; i++) {
            temp = arr.get(i);  // первый элемент в temp
            arr.set(i, arr.get(lenght-1 -i));  // последний элемент в первый
            arr.set(lenght-1 -i, temp); // temp в первый

        }
        return arr;
    }
    /*
       add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
        get(pos) – возвращает элемент из списка по указанной позиции
        indexOf(item) – первое вхождение или -1
        lastIndexOf(item) – последнее вхождение или -1
        remove(pos) – удаление элемента на указанной позиции и его возвращение
        set(int pos, T item) – заменяет значение item элементу, который находится
        на позиции pos
        void sort(Comparator) – сортирует набор данных по правилу
        subList(int start, int end) – получение набора данных от позиции start до end
        */


}
