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
                .replace("'", "").replace(" ", "");

        String[] parts = str.split(","); // разделяем по символу

        StringBuilder sqlSelect = new StringBuilder("select * from students where " +
                "name = " + getFileExtension(parts[0]) + " and " +
                "country = " + getFileExtension(parts[1]) + " and " +
                "city = " + getFileExtension(parts[2]));
        System.out.println(sqlSelect);

    }

    private static String getFileExtension(String str) {
        int index = str.indexOf(':');
        return index == -1? null : str.substring(index+1);//обрезать по символу
    }

}
