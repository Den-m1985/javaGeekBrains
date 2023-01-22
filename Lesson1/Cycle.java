public class Cycle {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;
        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);

        int value2 = 321;
        int count2 = 0;
        do {
            value2 /= 10;
            count2++;
        } while (value2 != 0);
        System.out.println(count2);

        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        System.out.println(s);


        for (int i = 1; i <= 10; i++) {
            if (i%2 == 0){
                continue;
            }
            System.out.println(i);
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int arr[] = new int[10];
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
        System.out.println();



    }
}
