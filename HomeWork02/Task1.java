public class Task1 {
    // Дана строка sql-запроса "select * from students where ".
    // Сформируйте часть WHERE этого запроса, используя StringBuilder.
    // Данные для фильтрации приведены ниже в виде json строки.
    //Если значение null, то параметр не должен попадать в запрос.
    //Параметры для фильтрации:
    // String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
    //Результат "select * from students where “name” = “Ivanov” and “country”=”Russia” …

    public static void main(String[] args) {
        String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}"
                .replace("{", "").replace("}", "")
                .replace("'", "");

        String[] parts = str.split(",");
        //for (String s: parts) {
        //    if (s.equals("name:Ivanov"))
        //        //System.out.println(s);
        //}

        int index = parts[0].indexOf(':');
        String s = parts[0].substring(index+1);

        System.out.println("select * from students where “name” = " + s);

    }

    private static String getFileExtension(String str) {
        int index = str.indexOf('.');
        return index == -1? null : str.substring(index);//обрезать расширение
    }

}
