import java.util.*;

public class Task2 {

    public static void main(String[] args) {

        Task1.NewLaptop(Task1.lapTopBase);
        SortNameAlphabetically(Task1.shop);

    }


    private static void SortNameAlphabetically(Map<Integer, LapTop> notebookSet) {

        // code from Oleg.
        // для того, чтобы проще думать. Запишем все ноутбуки в List, чтобы потом перебрать и сравнить
        List<LapTop> valueList = new ArrayList<>(notebookSet.values());
        for (int i = 0; i < valueList.size(); i++) {
            for (int j = 1; j < valueList.size(); j++) {
                //System.out.println(valueList.get(i).GetNameCompany()); выводит компанию
                if (valueList.get(i).GetNameCompany().compareTo(valueList.get(j).GetNameCompany())>1) {
                    // метод compareTo позволяет сравнивать строки и возвращает положительный результат если первая больше, чем вторая
                    Collections.swap(valueList, i, j);//меняем местами элементы в коллекции valueList
                }
            }
        }
        // перебор и печать
        for (LapTop lapTop : valueList) {
            System.out.println(lapTop.getInfo());
        }

    }


}
