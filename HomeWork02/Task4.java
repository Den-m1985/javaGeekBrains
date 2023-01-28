import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task4 {
    // К калькулятору из предыдущего дз добавить логирование.

    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(Task4.class.getName());
        FileHandler fh = new FileHandler("logTask4.txt");
        logger.addHandler(fh); // Добавляем аргумент для нашего logger.

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.setUseParentHandlers(false); // убираем логи с консоли.

        try {
            Scanner scaner = new Scanner(System.in);
            while (true) {
                System.out.println("\n Для выхода введите q");

                System.out.print("Введите первое число: ");
                int a = scaner.nextInt();
                logger.info("first number " + a);

                System.out.print("Введите математическую операцию: ");
                String x = scaner.next();
                logger.info("operation " + x);

                System.out.print("Введите второе число: ");
                int b = scaner.nextInt();
                logger.info("second number " + b);

                if (x.equals("q")) break;
                else if (x.equals("+")) Sum(a, b);
                else if (x.equals("-")) Minus(a, b);
                else if (x.equals("*")) Mul(a, b);
                else if (x.equals("/")) Divide(a, b);
            }
            scaner.close();
        }catch (Exception e){
            System.out.println("Ошибка");
        }
    }


    public static void Sum(int a,int b){
        System.out.println(a + " + " + b + " = " + (a + b));
    }
    public static void Minus(int a,int b){
        System.out.println(a + " - " + b + " = " + (a - b));
    }
    public static void Mul(int a,int b){
        System.out.println(a + " * " + b + " = " + (a * b));
    }
    public static void Divide(double a,double b){
        System.out.println(a + " / " + b + " = " + (a / b));
    }

}
