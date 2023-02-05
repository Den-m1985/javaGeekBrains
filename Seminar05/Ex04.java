import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Ex04 {
    /*

     */
    public static void main(String[] args) {
        SortString();
    }

    public static void SortString() {
        String s = "Мороз и солнце день чудесный Еще ты дремлешь друг\n" +
                "прелестный Пора красавица проснись.";
        String[] sMas = s.split(" ");
        System.out.println(sMas.length);
        TreeMap<Double, String> words = new TreeMap<>();
        double p = 0.1;
        for (String string : sMas) {

            if (words.containsKey((double) string.length())) {  // Если containsKey содержит такую длину
                words.put((double) string.length() + p, string);  // то кладем с увеличиным на р
                // если мы в один ключ закиним несколько значение, то они перетрутся и поряются слова.
                p += 0.1;
            } else
                words.put((double) string.length(), string);
        }
        for (var el : words.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }
        // 2й вариант
        TreeMap<String, Integer> words2 = new TreeMap<>();
        for (String string : sMas) {
            words2.put(string, string.length());
        }
        System.out.println("До сортировки");
        for (var el : words2.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }


        // stream используем для того, что бы использовать sorted
        // stream это поток который позволяет разложить Map и применить методы в том числе sorted
        List<Map.Entry<String, Integer>> list = words2.entrySet().stream()
                // это лямбда функция которая возвращяем больше, меньше или 0
                // если длин первого больше длины второго меняет местами.
                .sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
                // обратное представление в List.
                .collect(Collectors.toList());
        System.out.println();
        for (var el : list) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }
    }
}

