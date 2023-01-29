
import java.util.ArrayList;
public class Ex002 {

   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>();
       //ArrayList list = new ArrayList();
       list.add(2809);


       for (Object o : list) {
           System.out.println(o);
       }
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
   }
}
