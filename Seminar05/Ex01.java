import java.util.*;

public class Ex01 {
        /*
        Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
        123456 Иванов
        321456 Васильев
        234561 Петрова
        234432 Иванов
        654321 Петрова
        345678 Иванов
        Вывести данные по сотрудникам с фамилией Иванов.
         */

    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        Map<Integer, String> names = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите номер и фамилию: ");
            String[] name = iScanner.nextLine().split(" ");//name[0] - номер. name[1] - фамилия
            // используем parseInt т.к. split возвращает строку.
            names.put(Integer.parseInt(name[0]), name[1]);
        }

        for (Map.Entry<Integer, String> el : names.entrySet()) {
            if (el.getValue().equals("Ivanov"))
                System.out.print(el.getKey()+ ": "+ el.getValue() + "\n");
        }
        iScanner.close();


    }

}


