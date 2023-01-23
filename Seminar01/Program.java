import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // https://vertex-academy.com/tutorials/ru/java-8-new-date-time-api-chast-1/
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //Scanner iScaner = new Scanner(System.in);
        //System.out.print("Enter something: ");
        //String name = iScaner.next();
        //System.out.println(name);
        //iScaner.close();
        Print(now);
    }
    public static void Print(String name){
        LocalTime now = LocalTime.now();
        if (now.isAfter(LocalTime.of(5,0)))
            System.out.println(now);
    }
}
