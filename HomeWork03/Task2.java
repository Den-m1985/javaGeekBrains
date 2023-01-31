import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    /*
    Пусть дан произвольный список целых чисел, удалить из него четные числа
     */
    public static void main(String[] args) {
        System.out.println("Origin array:");
        List<Integer> array = FillList();
        PrintList(array);
        System.out.println("Array without even numbers:");
        PrintList(DeleteListNumber(array));
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

    public static List<Integer> DeleteListNumber(List<Integer> lst){
        /*
       add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
        get(pos) – возвращает элемент из списка по указанной позиции
        indexOf(item) – первое вхождение или -1
        lastIndexOf(item) – последнее вхождение или -1
        remove(pos) – удаление элемента на указанной позиции и его возвращение
        set(int pos, T item) – gjvtoftn значение item элементу, который находится
        на позиции pos
        void sort(Comparator) – сортирует набор данных по правилу
        subList(int start, int end) – получение набора данных от позиции start до end
        */
        List<Integer> listWithoutNumber = new ArrayList<>();
        int lengthLst = lst.size();
        for (int i = 0; i < lengthLst; i++) {
            if (lst.get(i) % 2 != 0)
                listWithoutNumber.add(lst.get(i));
        }
        return listWithoutNumber;
    }

}
