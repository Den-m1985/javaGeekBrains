import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        /*
        Создать список типа ArrayList<String>.
        Поместить в него как строки, так и целые числа.
        Пройти по списку, найти и удалить целые числа.
         */
        DeleteListNumber();

    }


    public static void DeleteListNumber(){
        List<String> list = new ArrayList<>();
        List<String> listWithoutNumber = new ArrayList<>();
        String [] allPlanets = new String[]{"Earth", "Mars", "Jupiter", "Vines"};

        for (int i = 0; i < 10; i++) {
            if (i %2 == 0)
                list.add(allPlanets[(int)(Math.random()* allPlanets.length)]);
            else {
                Integer num = new Random().nextInt(10);
                list.add(Integer.toString(num));
            }
        }
        // Печатаем массив с кол-вом совпадений.
        for (String x: list) {
            System.out.print(x + " ");
        }


        // перебираем элементы массива и пробуем превратить элелемент в число.
        for (String string: list) {
            try {
                Integer.parseInt(string);
            }
            catch (Exception e){
                listWithoutNumber.add(string);
            }

        }

        System.out.println();
        for (String x: listWithoutNumber) {
            System.out.print(x + " ");
        }

    }
}
