import java.time.LocalDateTime;

public class Cat {
    String name;
    String color;
    LocalDateTime date;
    String breed;

    void Print() {
        System.out.println(name + " "+ color + " "+date+" "+ breed );
    }

    Cat(String n, String c, LocalDateTime d, String b) {
        name = n;
        color = c;
        date = d;
        breed = b;
    }
    // Cat(LocalDateTime d, String n, String c, String b){
    //     name = n;
    //     color = c;
    //     date = d;
    //     breed = b;
    // }
    Cat() {
        name = "Gray";
        color = "Black";
        date =  LocalDateTime.now();
        breed = "scotland";
    }
    Cat(String name, String color) {
        this.name = name;
        this.color = color;
        date =  LocalDateTime.now();
        breed = "scotland";
    }

    // Переопределяем equals
    @Override
    public boolean equals(Object obj) {
        // Если объекты разных классов не равны, возвразаем
        // this.getClass() класс который метод вызвал
        // obj.getClass() класс в который мы передаем equals
        if (this.getClass()!=obj.getClass()) return false;
        // Создаем конкретный экземпляр Cat  от Object.
        Cat compareCat = (Cat) obj;
        if (this.name.equals(compareCat.name) && this.color.equals(compareCat.color)) return true;
        return false;
    }


    /*
    Создайте метод public int hashCode()
    который будет возвращать hash, вычисленный на основе полей класса Cat.
    (Можно использовать Objects.hash(...))
     */
    @Override
    public int hashCode() {
        int res = this.name.hashCode() + this.color.hashCode() + this.breed.hashCode();
        return res;
    }

}
