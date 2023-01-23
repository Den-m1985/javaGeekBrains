import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // https://vertex-academy.com/tutorials/ru/java-8-new-date-time-api-chast-1/
        //LocalDateTime now = LocalDateTime.now();
        //System.out.println(now);
        // прописываем кодировку для кирилицы.
        String encoding = System.getProperty("console.encoding","cp866");
        Scanner iScaner = new Scanner(System.in, encoding);
        System.out.print("Enter something: ");
        String name = iScaner.next();
        //System.out.println(name);
        String temp = Print(name);
        System.out.println(temp);
        iScaner.close();

    }
    public static String Print(String name){
        LocalTime now = LocalTime.now();
        if (now.isAfter(LocalTime.of(5,0)) && now.isBefore(LocalTime.of(11,59)))
            return "Good morning " + now;
        else if (now.isAfter(LocalTime.of(12,0)) && now.isBefore(LocalTime.of(19,59)))
            return "Good day " + now;
        return "Good evening " + now;
    }
}
