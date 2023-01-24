import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;
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
        //int x = iScaner.nextInt();
        //System.out.println(name);
        String temp = Print(name);
        System.out.println(temp);
        iScaner.close();


        int [] arr = new int [10];
        FillMass(arr);
        PrintArray(arr);
        System.out.println();
        System.out.print("Count = ");
        FindMaxCounter(arr);

    }
    public static String Print(String name){
        LocalTime now = LocalTime.now();
        if (now.isAfter(LocalTime.of(5,0)) && now.isBefore(LocalTime.of(11,59)))
            return "Good morning " + now;
        else if (now.isAfter(LocalTime.of(12,0)) && now.isBefore(LocalTime.of(19,59)))
            return "Good day " + now;
        return "Good evening " + now;
    }
    public static void FillMass(int [] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*2); //(int) *2 нужно т.к. random возвращает doble 0,5; 1,6
            //array[i] = random.nextInt(2);
        }
    }

    public static void PrintArray(int [] array){
        for (var el: array){
            System.out.print(el + " ");
        }
    }

    public static void FindMaxCounter(int [] array){
        int count = 1;
        int result = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i-1] && array[i] == 1){
                count ++;
                if (count > result) result = count;
            }else count = 1;
        }
        System.out.println(result);
    }
}
