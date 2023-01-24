public class Task1 {
    // Вычислить n-ое треугольного число(сумма чисел от 1 до n),
    // n! (произведение чисел от 1 до n)
    public static void main(String[] args) {
        int n = 4;
        int x = SumNumber(n);
        System.out.println("Sum numbers of "+ n + " = "+ x);
        System.out.println();

        int mult = Fuctorial(n);
        System.out.println("Mult numbers of "+ n + " = "+ mult);

    }
    public static int SumNumber(int n){
        if (n == 0) return 0;
        return SumNumber(n-1) + n;
    }
    public static int Fuctorial(int n){
        if (n == 1) return 1;
        return Fuctorial(n-1) * n;
    }
}
