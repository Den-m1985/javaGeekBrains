import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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
    public static Map<String, String> readFile() throws FileNotFoundException {


        TreeMap<String, String> words = new TreeMap<>();
        Scanner filescanner = new Scanner(new FileReader("Task2.txt"));
        while (filescanner.hasNextLine()) {
            String[] columns = filescanner.nextLine().split(": ");
            //words.put(columns[0], columns[1]);

        double p = 0.1;
        for (String string : columns) {
            //words.put(string, string);
            System.out.println(string);
        }
//                if (words.containsKey((double) string.length())) {  // Если containsKey содержит такую длину
//                    words.put((double) string.length() + p, string);  // то кладем с увеличиным на р
//                    // если мы в один ключ закиним несколько значение, то они перетрутся и поряются слова.
//                    p += 0.1;
//                } else
//                    words.put((double) string.length(), string);

        }
//            for (var el : words.entrySet()) {
//                System.out.print(el.getKey() + " " + el.getValue() + "\n");
//            }


        return words;
    }


}
