import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Ex02 {
    /*
    Реализовать консольное приложение, которое:
    Принимает от пользователя и “запоминает” строки.
    Если введено print, выводит строки так,
    чтобы последняя введенная была первой в списке, а первая - последней.
    Если введено revert, удаляет предыдущую введенную строку из памяти
     */
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        while (true) {
            String str = iScanner.nextLine();
            if (str.equals(""))
                break;
            else if (str.equals("print")) {
                Collections.reverse(stack); // разворачиваем stack.
                System.out.println(stack);
            } else if (str.equals("revert"))
                stack.pop();  // удаляем последний
            else
                stack.push(str);  // добавляем в наш stack

        }
        iScanner.close();
    }
}
