import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Task1 {
    /*
    Реализуйте структуру телефонной книги с помощью HashMap,
    учитывая, что 1 человек может иметь несколько телефонов.
    https://metanit.com/java/tutorial/5.8.php
    https://metanit.com/java/tutorial/6.8.php
     */

    // прописываем кодировку для кирилицы.
    public static String encoding = System.getProperty("console.encoding", "cp866");
    public static Scanner iScanner = new Scanner(System.in, encoding);


    public static void main(String[] args) throws IOException {

        saveFile(addContact());  // записываем контакт
        printHashMap(readFile());

    }


    // Добавление контакта
    public static Map<String, String> addContact() {
        Map<String, String> contact = new HashMap<>();
        System.out.print("Введите номер и фамилию через пробел: ");
        String[] name = iScanner.nextLine().split(" ");
        //name[0] - номер. name[1] - контакт
        contact.put(name[0], name[1]);
        iScanner.close();

        return contact;
    }


    // сохраняем в файл
    public static void saveFile(Map<String, String> s) throws IOException {  // Сохранение файла

        // Проблемма с кодировкой UTF_8
        try (FileWriter writer = new FileWriter("Task1.txt", true)) {
            for (Map.Entry<String, String> entry : s.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Не записывает
//            File file = new File("Task1.txt");
//            file.createNewFile(); // если файл существует - команда игнорируется
//            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
//            // false -> true, если надо продолжать писать в файл при его наличии, с false файл будет очищен
//            Writer writer = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
//
//            for (Map.Entry<String, String> entry : s.entrySet()) {
//                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
//            }
    }


    // Читаем из файла
    public static Map<String, String> readFile() throws FileNotFoundException {
        Map<String, String> dictionary = new HashMap<>();
        Scanner filescanner = new Scanner(new FileReader("Task1.txt"));
        while (filescanner.hasNextLine()) {
            String[] columns = filescanner.nextLine().split(": ");
            dictionary.put(columns[0], columns[1]);
        }
        return dictionary;

    }


    // Печатаем файл в консоль
    public static void printHashMap(Map<String, String> names) {
        for (Map.Entry<String, String> el : names.entrySet()) {
            System.out.print(el.getKey() + ": " + el.getValue() + "\n");
        }
    }
}
