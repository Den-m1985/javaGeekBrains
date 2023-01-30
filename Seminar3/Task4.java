import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Task4 {

    static Logger LOGGER;
    static {
        //Р·Р°Р±РёСЂР°РµРј РєРѕРЅС„РёРіСѓСЂР°С†РёСЋ РёР· log.config
        try (FileInputStream ins = new FileInputStream("log.config")) {
            //СѓСЃС‚Р°РЅР°РІР»РёРІР°РµРј
            LogManager.getLogManager().readConfiguration(ins);
            //РґР°РµРј РЅР°Р·РІР°РЅРёРµ Р»РѕРіРіРµСЂСѓ
            LOGGER = Logger.getLogger("MyLogger");
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
    }

    public static void main(String[] args) {
        /*  Не сделано!

        Каталог товаров книжного магазина сохранен в
        виде двумерного списка List<ArrayList<String>> так,
        что на 0й позиции каждого внутреннего списка содержится
        название жанра, а на остальных позициях - названия книг.
        Напишите метод для заполнения данной структуры.
         */
        System.out.println("gdfg");
        LOGGER.log(Level.INFO, "message");
    }
}
