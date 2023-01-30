import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        /*
        Заполнить список названиями планет Солнечной системы
        в произвольном порядке с повторениями.
        Вывести название каждой планеты и количество его повторений в списке.
         */
        FillPlanetList();



    }

    public static void FillPlanetList(){
        String [] allPlanets = new String[]{"Earth", "Mars", "Jupiter", "Vines"};
        List<String> planetList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            // добавляем рандомное число (индекс планеты) от 0 до длины allPlanets
            //т.е. заполняем список рандомными планетами
            planetList.add(allPlanets[(int)(Math.random()* allPlanets.length)]);
        }
        for (String x: planetList) {
            System.out.print(x + " ");
        }
        System.out.println();

        //сортируем по порядку.
        planetList.sort(null);
        for (String x:planetList) {
            System.out.print(x + " ");
        }

        System.out.println();
        int count = 1;
        for (int i = 1; i < planetList.size(); i++) {
            if (planetList.get(i) != planetList.get(i-1)){
                System.out.println(planetList.get(i-1) + " " + count);
                count = 1;
            }
            else count++;
        }
        System.out.println(planetList.get(planetList.size()-1) + " " + count);


    }
}
