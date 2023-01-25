public class Task2 {
    //Вывести все простые числа от 1 до 1000
    public static void main(String[] args) {

        int count = 1;
        int n = 100;//число до которого необходимо найти все простые числа
        for (int i = 1; i <= n; i++) {
            if (simpleNumbers(i)) {
                count++;//счетчик простых чисел
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Количество простых чисел: " + count);//вывод количества
    }

    static boolean simpleNumbers(int i) {//берем число i

        if (i<=1)
            return false;
        else if (i <=3)
            return true;
        else if (i%2==0 || i %3 ==0)
            return false;
        int n = 5;
        while (n*n <=i){
            if (i % n ==0 || i % (n+2) == 0)
                return false;
            n=n+6;
        }
        return true;
    }

}

