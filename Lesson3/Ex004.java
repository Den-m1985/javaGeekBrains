
import java.util.Arrays;
import java.util.List;

public class Ex004 {
    public static void main(String[] args) {
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = { day, month, year };
        List<Integer> d = Arrays.asList(date);
        System.out.println(d); // [29, 9, 1990]
    }
    /*
    clear() – очистка списка
    toString() – «конвертация» списка в строку
    Arrays.asList – преобразует массив в список
    containsAll(col) – проверяет включение всех элементов из col
    removeAll(col) – удаляет элементы, имеющиеся в col
    retainAll(col) – оставляет элементы, имеющиеся в col
    toArray() – конвертация списка в массив Object’ов
    toArray(type array) – конвертация списка в массив type
    List.copyOf(col) – возвращает копию списка на основе имеющегося
    List.of(item1, item2,...) – возвращает неизменяемый список
     */
}