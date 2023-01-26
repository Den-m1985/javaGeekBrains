
import java.io.File;

public class Ex002_fileSystemDemo {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());

        System.out.println(pathFile);
        // относительный путь
        File f1 = new File("file.txt");
        // абсолютный путь
        File f2 = new File("/Users/sk/vscode/java_projects/file.txt");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());

        /*
        Неправильный путь
        Отсутствие папки
        Отсутствие файла
        Файл неверного типа
        Файл очень большой
        Файл пусой
        Файл битый
        Файл открыт сторонней программой
         */
    }
}