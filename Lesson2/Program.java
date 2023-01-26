public class Program {
    public static void main(String[] args) {
        // позволяет очень быстро работать со строками.
        // Если нужно ковырятся в готовом масиве строк, то используем String.
        var s = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - s);  //47 ms

        /*
        concat(): объединение строк
        valueOf(): преобразует Object в строковое представление (завязан на toString())
        join(): объединяет набор строк в одну с учетом разделителя
        charAt(): получение символа по индексу
        indexOf(): первый индекс вхождения подстроки
        lastIndexOf(): последний индекс вхождения подстроки
        startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
        replace(): замена одной подстроки на другую
        trim(): удаляет начальные и конечные пробелы
        substring(): возвращает подстроку, см.аргументы
        toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
        сompareTo(): сравнивает две строки
        equals(): сравнивает строки с учетом регистра
        equalsIgnoreCase(): сравнивает строки без учета регистра
        regionMatches(): сравнивает подстроки в строках
         */

        String[] name = { "C", "е", "р", "г", "е", "й" };
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("", name)); // Cергей
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
        // C,е,р,г,е,й
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));


    }
}

