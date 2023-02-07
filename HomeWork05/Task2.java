import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Task2 {
    /*
    Пусть дан список сотрудников:Иван Иванов и т.д.

     Написать программу, которая найдет и выведет
     повторяющиеся имена с количеством повторений.
     Отсортировать по убыванию популярности.
     */
    public static void main(String[] args) throws FileNotFoundException {
        readFile();

    }


    // Читаем из файла
    public static void readFile() throws FileNotFoundException {

        Map<String, Integer> contact = new HashMap<>();
        List<String> words = new ArrayList<>();

        // Читаем файл, берем только имя.
        Scanner filescanner = new Scanner(new FileReader("Task2.txt"));
        while (filescanner.hasNextLine()) {
            String[] columns = filescanner.nextLine().split(": ");
            words.add(columns[0]);
        }




        for (String s : words) {
            if (contact.containsKey(s)) {  // кладем значение и получаем ключ, если он есть
                contact.put(s, contact.get(s) + 1);
            } else {
                contact.put(s, 1);
            }
        }


        //contact.entrySet().forEach(System.out::println);
        // Сортируем по ключу
        Map<String, Integer > sorted = new TreeMap<>(contact);
        sorted.entrySet().forEach(System.out::println);

        //printHashMap(contact);

    }

    public static void FindSameName(){

    }

    public static void sortByKey(){

    }

    // Печатаем HashMap
    public static void printHashMap(Map<String, Integer> names) {
        for (Map.Entry<String, Integer> el : names.entrySet()) {
            System.out.print(el.getKey() + ": " + el.getValue() + "\n");
        }
    }


}
