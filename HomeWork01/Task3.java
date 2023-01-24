import java.util.Scanner;

public class Task3 {
    //Реализовать простой калькулятор
    // (пользователь вводит 2 числа и вводит операцию (+ - / *).
    // int a ; int b; String op (op!=”Stop”); (char != ’b’
    public static void main(String[] args) {
        try {
            Scanner scaner = new Scanner(System.in);
            while (true) {
                System.out.println("\n Для выхода введите q");

                System.out.print("Введите первое число: ");
                int a = scaner.nextInt();

                System.out.print("Введите математическую операцию: ");
                String x = scaner.next();

                System.out.print("Введите второе число: ");
                int b = scaner.nextInt();

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
