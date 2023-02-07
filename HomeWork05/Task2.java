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
        List<String> words = readFile();
        Map<String, Integer> contact = findSameName(words);
        Map<String, Integer > sorted = sortByKey(contact);
        printHashMap(sorted);

        /*
        HashMap<Integer, String> map = new HashMap<>();
        map.put(5, "five");
        map.put(11, "eleven");
        map.put(4, "four");
        map.put(77, "seventy seven");
        map.put(9, "nine");

        System.out.println("HashMap before sorting: " + map);

        //Sorting HashMap by keys using TreeMap
        Map<Integer, String> sorted = new TreeMap<>(map);

        System.out.println("HashMap after sorting by keys: " + sorted);

         */
    }


    // Читаем из файла Task2.txt
    public static List<String> readFile() throws FileNotFoundException {

        List<String> words = new ArrayList<>();
        // Читаем файл, берем только имя.
        Scanner filescanner = new Scanner(new FileReader("Task2.txt"));
        while (filescanner.hasNextLine()) {
            String[] columns = filescanner.nextLine().split(": ");
            words.add(columns[0]);
        }
        return words;
    }


    // Находим одинаковые имена
    public static Map<String, Integer> findSameName(List<String> words){

        Map<String, Integer> contact = new HashMap<>();
        for (String s : words) {
            if (contact.containsKey(s)) {  // кладем значение и получаем ключ, если он есть
                contact.put(s, contact.get(s) + 1);
            } else {
                contact.put(s, 1);
            }
        }
        return contact;
    }


    public static Map<String, Integer > sortByKey(Map<String, Integer> contact){
        Map<String, Integer > sorted = new TreeMap<>(contact);
        //sorted.entrySet().forEach(System.out::println);
        return sorted;
    }


    // Печатаем HashMap
    public static void printHashMap(Map<String, Integer> names) {
        for (Map.Entry<String, Integer> el : names.entrySet()) {
            System.out.print(el.getKey() + "= " + el.getValue() + "\n");
        }
    }

}
