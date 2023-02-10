import java.util.Map;
import java.util.Scanner;

public class Controller {

    public static Scanner iScanner = new Scanner(System.in);

    public static void main() {

        while (true) {
            System.out.print("сделать выборку по:\n" +
                    "1 - ОЗУ\n" +
                    "2 - Объем ЖД\n" +
                    "3 - Операционная система\n" +
                    "4 - Цвет \n" +
                    "Для выхода введите q\n" +
                    "Введите число: ");


            String number = iScanner.next();
            if (number.equals("q")) {
                System.out.println("Выход");
                break; // если символ "ничего". Остановка цикла через Enter.
            } else if (isDigit(number)) {
                int enterNumber = Integer.parseInt(number);
                if (enterNumber > 0 && enterNumber < 5) {
                    switch (enterNumber) {
                        case 1:
                            SortMemoryRAM();
                            break;
                        case 2:
                            SortVolumeHD();
                            break;
                        case 3:
                            SortOS();
                            break;
                        case 4:
                            SortColor();
                            break;
                    }
                }else System.out.println("Ведите число от 1 до 4\n");

            } else System.out.println("Ведите число от 1 до 4\n");

        }
        iScanner.close();


    }


    public static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void SortMemoryRAM() {
        System.out.println();
        System.out.println("Выборка по оперативной памяти:");

        for (Map.Entry<Integer, LapTop> el : Task1.shop.entrySet()) {
            System.out.print(el.getValue().GetMemoryRAM() + "\n");
        }
        System.out.println();
    }

    public static void SortVolumeHD() {
        System.out.println();
        System.out.println("Выборка по жесткому диску:");

        for (Map.Entry<Integer, LapTop> el : Task1.shop.entrySet()) {
            System.out.print(el.getValue().GetVolumeHD() + "\n");
        }
        System.out.println();
    }

    public static void SortOS() {
        System.out.println();
        System.out.println("Выборка по операционной системе:");

        for (Map.Entry<Integer, LapTop> el : Task1.shop.entrySet()) {
            System.out.print(el.getValue().GetOS() + "\n");
        }
        System.out.println();
    }

    public static void SortColor() {
        System.out.println();
        System.out.println("Выборка по цвету:");

        for (Map.Entry<Integer, LapTop> el : Task1.shop.entrySet()) {
            System.out.print(el.getValue().GetColor() + "\n");
        }
        System.out.println();
    }

}
