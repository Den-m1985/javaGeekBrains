import java.util.*;

public class Task3 {
    /*
     Реализовать алгоритм пирамидальной сортировки (HeapSort).
     */
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(5, "five");
        map.put(11, "eleven");
        map.put(4, "four");
        map.put(77, "seventy seven");
        map.put(9, "nine");

        System.out.println("HashMap before sorting: "+map);

        //Sorting HashMap by keys using TreeMap
        Map<Integer, String> sorted = new TreeMap<>(map);

        System.out.println("HashMap after sorting by keys: "+sorted);




    }
}
