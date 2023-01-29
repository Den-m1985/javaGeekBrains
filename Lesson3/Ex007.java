
import java.util.*;

public class Ex007 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) {
            System.out.println(item);
        }

        Iterator<Integer> col = list.iterator();
        System.out.println();


        // пока есть следующий элемент
        while (col.hasNext()) {
            col.remove();
            System.out.println(col.next());
            //col.next();
        }

    }
}
