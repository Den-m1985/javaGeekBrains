import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task2 {
    // 2) Реализуйте алгоритм сортировки пузырьком числового массива,
    // результат после каждой итерации запишите в лог-файл.

    public static void main(String[] args) throws IOException {
        int [] mas = {11, 3, 14, 16, 7};
        boolean isSorted = false;
        int buf = 0;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        for (int ar: mas) {
            System.out.println(ar);
        }

        log();
    }

    public static void log() throws IOException {
        Logger logger = Logger.getLogger(Task2.class.getName());
        FileHandler fh = new FileHandler("logTask2.txt");
        logger.addHandler(fh); // Добавляем аргумент для нашего logger.
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        //logger.setUseParentHandlers(false); // убираем логи с консоли.
        logger.info("Array sort successful");

    }
}
