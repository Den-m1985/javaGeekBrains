public class Task2 {
    //Вывести все простые числа от 1 до 1000
    public static void main(String[] args) {
        int a = 20; // подставляем нужное число
        System.out.println("Простые числа от 1 до " + a);
        for (int i = 1; i < a+1; i++) {
            System.out.print(i + " ");
        }
    }
}
