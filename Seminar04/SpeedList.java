import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SpeedList {
    public static void main(String[] args) {
        int count = 10000;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        long start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            list1.add(i);
        }
        long end = System.nanoTime();
        System.out.println(end - start);
        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            list2.add(i);
        }
        end = System.nanoTime();
        System.out.println(end - start);
    }
}
