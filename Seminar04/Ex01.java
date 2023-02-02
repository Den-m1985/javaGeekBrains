import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        /*
        Задание №1
        Реализовать консольное приложение, которое:
        1. Принимает от пользователя строку вида
        text~num
        2. Нужно рассплитить строку по ~, сохранить text в связный список на
        позицию num. Split
        3. Если введено print~num, выводит строку из позиции num в связном
        списке и удаляет её из списка.
         */
        Scanner iScanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        while (true) {
            String str = iScanner.nextLine();
            if (str.equals("")) // если символ "ничего". Остановка цикла через Enter.
                break;
            String[] strArr = str.split("~");//strArr[0]=name(), strArr[1]=number()
            int number = Integer.parseInt(strArr[1]); // переводим в число т.к. split это строка
            if (strArr[0].equals("print")) // если этот элемент print
                try {
                    System.out.println(names.get(number));
                    names.remove(number);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            else if (number != names.size()) {
                System.out.println("Incorrect index should be " + names.size());
                continue;
            } else
                names.add(number, strArr[0]);
        }
        iScanner.close();

    }
}


