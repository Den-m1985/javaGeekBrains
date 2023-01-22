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

        // Тернарный оператор
        int u = 1;
        int i = 2;
        int min = u < i ? u : i; //Если u < i то возвращается u
        System.out.println(min);

        int mounth = 10;
        String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;

            default:
                text = "mistake";
                break;
        }



    }

}
