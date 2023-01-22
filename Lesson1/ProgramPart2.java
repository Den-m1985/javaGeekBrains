public class ProgramPart2 {
    static void sayHi() {
        System.out.println("hi!");
    }
    static int sum(int a, int b) {
        return a+b;
    }
    static double factor(int n) {
        if(n==1)return 1;
        return n * factor(n-1);
    }
    public static void main(String[] args) {
        sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0

        int q = 1;
        int w = 2;
        int e;
        if (q > w) {
            e = q;
        } else {
            e = w;
        }
        System.out.println(e);

        // Сокращенная форма
        int r = 1;
        int t = 2;
        int y = 0;
        if (r > t) y = r;
        if (t > r) y = t;
        System.out.println(y);

    }

}
