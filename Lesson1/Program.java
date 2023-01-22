import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        float p = 2.7f;
        double pi = 3.1415;
        System.out.println(p); // 2.7
        System.out.println(pi); // 3.1415

        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // false

        var u = 123;
        System.out.println(u); // 123
        var y = 123.456;
        System.out.println(y); // 123.456
        System.out.println(getType(u)); // Integer
        System.out.println(getType(y)); // Double
        y = 1022;
        System.out.println(y); // 1022
        //d = "mistake";
        //error: incompatible types:
        //String cannot be converted to double

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648

        /*
        Присваивание: =
        ● Арифметические: *, /, +, -, %, ++, --
        ● Операции сравнения: <, >, ==, !=, >=, <=
        ● Логические операции: ||, &&, ^, !
        ● Побитовые операции <<, >>, &, |, ^
         */

        int a = 123;
        System.out.println(a++); // Постфиксный инкремент a++ не имеет приоритет над выводом в консоли.
        System.out.println(a);
        System.out.println(++a); // Префиксный инкремент имеет приоритет над выводом над консолью.

        int b = 10;
        a = a-- - --a;
        System.out.println(a);

        int c = 5;
        int d = 2;
        System.out.println(c | d);  // или
        // 101
        // 010
        // 111 получается
        System.out.println(c & d); //и
        //101
        //010
        //000

        String s = "qwer1";
        boolean e = s.length() >= 5 && s.charAt(4) == '1'; // длина строки >= 5 и 4й символ равен 1.
        System.out.println(e);

        int [] q = new int [10];
        q [1] = 10;
        System.out.println(q[1]);


        int [] arr [] = new int [3][5];
        for (int [] line : arr) {
            for (int item : line) {
                System.out.printf("%d", item);
            }
            System.out.println();
        }
        System.out.println();

        int [][] arr2 = new int [3][5];
        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[i].length; j++){
                System.out.printf("%d", arr2[i][j]);
            }
            System.out.println();
        }


        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();

        Scanner iScanner2 = new Scanner(System.in);
        System.out.printf("int a: ");
        int r = iScanner2.nextInt();
        System.out.printf("double a: ");
        double t = iScanner2.nextDouble();
        System.out.printf("%d + %f = %f", r, t, r + t);
        iScanner2.close();

        // проверка на валидность типа данных
        Scanner iScanner3 = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner3.hasNextInt(); // здесть проверка
        System.out.println(flag);
        int i = iScanner3.nextInt();
        System.out.println(i);
        iScanner3.close();

        // форматированный вывод
        int g = 1, f = 2;
        int h = g + f;
        String res = g + " + " + f + " = " + h; // получается 4 строки, код не эффективный
        System.out.println(res);

        int k = 1, l = 2;
        int z = k + l;
        String res2 = String.format("%d + %d = %d \n", k, l, z);
        System.out.printf("%d + %d = %d \n", k, l, z);
        System.out.println(res2);

        // Виды спецификаторов:
        /*
        %d: целочисленных значений
        %x: для вывода шестнадцатеричных чисел
        %f: для вывода чисел с плавающей точкой
        %e: для вывода чисел в экспоненциальной форме,
        например, 3.1415e+01
        %c: для вывода одиночного символа
        %s: для вывода строковых значений
         */

        float pi2 = 3.1415f;
        System.out.printf("%f\n", pi2); // 3,141500
        System.out.printf("%.2f\n", pi2); // 3,14
        System.out.printf("%.3f\n", pi2); // 3,141
        System.out.printf("%e\n", pi2); // 3,141500e+00
        System.out.printf("%.2e\n", pi2); // 3,14e+00
        System.out.printf("%.3e\n", pi2); // 3,141e+00


    }
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}
