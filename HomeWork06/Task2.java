import java.util.*;

public class Task2 {

    public static void main(String[] args) {
        Task1.NewLaptop(Task1.lapTopBase);
        sortLapTop();


    }

    private static void sortLapTop() {

        Map<String, String> unsortedMap = new HashMap<>();
        List<String> keys = new LinkedList<>();

        for (Map.Entry<Integer, LapTop> x : Task1.shop.entrySet()) {
            //System.out.println(x.getValue().GetNameCompany());
            keys.add(x.getValue().GetMemoryRAM());
            unsortedMap.put(x.getValue().GetNameCompany(), x.getValue().GetMemoryRAM());

        }
        //Collections.sort(keys);

    }


    public static void SortNameCompany() {

    }
}
