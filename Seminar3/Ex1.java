import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class Ex1 {
    public static Logger logger = Logger.getLogger("log.config");

    public static void main(String[] args) {

        //Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s4);

        System.out.println(s1 == s5); // false т.к. не ссылается на одну память
        System.out.println(s1.equals(s5)); // true т.е. проверяет символы


        /*
        Заполнить список десятью случайными числами.
        Отсортировать список методом sort() и вывести его на экран.
         */

        List<Integer> lst = new ArrayList<>();
        FillList(lst);
        PrintList(lst);


        logger.info("log");
    }

    public static void FillList(List<Integer> list){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int rand = random.nextInt(10);
            list.add(rand);
        }
    }
    public static void PrintList(List<Integer> list){
        list.sort(null);
        for (Integer x: list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
