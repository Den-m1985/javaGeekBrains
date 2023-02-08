import java.util.Arrays;
import java.util.HashSet;

public class Barsik {
    public static void main(String[] args) {
        Cat Barsic = new Cat();
            Barsic.name = "Barsik";
            Barsic.Print();
            Cat Pushok = new Cat("Pushok", "Black");
            Cat PushokCopy = new Cat("Pushok", "Black");
            Pushok.Print();

            //Создайте метод public boolean equals(Object o)
            System.out.println(Barsic.equals(Pushok));

            HashSet<Cat> setCats = new HashSet<>(Arrays.asList(Barsic, Pushok, PushokCopy));
            for (Cat cat : setCats) {
                cat.Print();
            }
    }
}
