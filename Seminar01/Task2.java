public class Task2 {
    // Вывести максимальное количество подряд идущих 1.
    public static void main(String[] args) {
        int [] array = new int []{1,1,0,1,1,1,1};
        int x = 1, count = 0, maxCount = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == x){
                count++;
                if (maxCount  < count)
                    maxCount = count;
            }
            else count = 0;

        }
        System.out.println(maxCount);

    }

}
