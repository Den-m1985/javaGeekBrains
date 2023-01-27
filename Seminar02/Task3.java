import java.io.*;

// https://metanit.com/java/tutorial/6.11.php

public class Task3 {
    /*
    Напишите метод, который составит строку, состоящую из 100
    повторений слова TEST и метод, который запишет эту строку в
    простой текстовый файл, обработайте исключения.
     */
    public static void main(String[] args) {
        String test = "TEST";
        saveFile(test);
    }


    public static void saveFile(String s) {  // Сохранение файла
        try {
            FileWriter f = new FileWriter("1.txt");
            for (int i = 0; i < 100; i++) {
                f.write(s);
                f.append('\n');
            }
            f.close();
        } catch (IOException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
    }
}





