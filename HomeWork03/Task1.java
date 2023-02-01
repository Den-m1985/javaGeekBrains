import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Task1 {
    /*
    Реализовать алгоритм сортировки слиянием
     */
    public static void main(String[] args) {

        List<Integer> array = FillList();
        PrintList(array);
        PrintList(sortArray(array));


        //PrintList(sortArray(array));

    }

    public static List<Integer> FillList() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int rand = random.nextInt(10);
            list.add(rand);
        }
        return list;
    }

    public static void PrintList(List<Integer> list) {
        for (Integer x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }



    public static List<Integer> sortArray(List<Integer> arrayA) { // сортировка Массива который передается в функцию
        int lengthArrayA = arrayA.size();
        

        if (lengthArrayA < 2) {
            return arrayA; // возврат в рекурсию в строки ниже см комменты.
        }
        // копируем левую часть от начала до середины
        //int [] arrayB = new int[arrayA.size() / 2];
        List<Integer> arrayB = new ArrayList<>();
        for (int i = 0; i < lengthArrayA/2; i++) {
            arrayB.add(arrayA.get(i));
        }
        //System.arraycopy(arrayA, 0, arrayB, 0, arrayA.size() / 2);

        // копируем правую часть от середины до конца массива, вычитаем из длины первую часть
        List<Integer> arrayC = new ArrayList<>();
        //int [] arrayC = new int[arrayA.length - arrayA.length / 2];
        for (int i = lengthArrayA / 2; i < lengthArrayA; i++) {
            arrayC.add(arrayA.get(i));
        }
        //System.arraycopy(arrayA, lengthArrayA / 2, arrayC, 0, lengthArrayA - lengthArrayA / 2);

        // рекурсией закидываем поделенные обе части обратно в наш метод, он будет крутится до тех пор,
        // пока не дойдет до 1 элемента в массиве, после чего вернется в строку и будет искать второй такой же,
        // точнее правую часть от него и опять вернет его назад
        arrayB = sortArray(arrayB); // левая часть возврат из рекурсии строкой return arrayA;
        arrayC = sortArray(arrayC); // правая часть возврат из рекурсии строкой return arrayA;

        // далее опять рекурсия возврата слияния двух отсортированных массивов
        return mergeArray(arrayB, arrayC);
    }

    public static List<Integer> mergeArray(List<Integer> arrayА, List<Integer> arrayB) {
        //function merge (left, right)
        int lengthArrayA = arrayА.size();
        int lengthArrayB = arrayB.size();
        int length = lengthArrayA + lengthArrayB;
        List<Integer> arrayC = new ArrayList<>();
        //var list result

        while (lengthArrayA > 0 && lengthArrayB > 0) {
            //while length(left) > 0 and length (right) > 0


            if (arrayА.get(0) <= arrayB.get(0)) {
                arrayC.add(arrayА.get(0));
                for (int i = 0; i < lengthArrayA; i++) {
                    arrayА.add(arrayА.get(i)); //??????????????
                }
            }
            //if first(left) ≤first(right)
            //append first (left) to result
            //left = rest(left)

            else {
                arrayC.add(arrayB.get(0));
                for (int i = 0; i < lengthArrayA; i++) {
                    arrayB.add(arrayB.get(i)); //??????????????
                }
                //else
                //append first (right) to result
                //right = rest(right)
            }

        }

        //while length(left) > 0
        //append first (left) to result
                //left = rest(left)
        //while length(right) > 0
        //append first (right) to result
                //right = rest(right)
        return arrayC;
    }
/*
    public static List<Integer> mergeArray(List<Integer> arrayА, List<Integer> arrayB) {
        List<Integer> arrayC = new ArrayList<>();

        int lengthArrayA = arrayА.size();
        int lengthArrayB = arrayB.size();
        int length = lengthArrayA + lengthArrayB;
        //int [] arrayC = int[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < length; i++) {
            if (positionA == lengthArrayA) {
                //arrayC[i] = arrayB[i - positionB];
                arrayC.add(i, arrayB.get(i - positionB));
                positionB++;
            } else if (positionB == lengthArrayB) {
                //arrayC[i] = arrayA[i - positionA];
                arrayC.add(i, arrayА.get(i - positionA));
                positionA++;
            } else if (arrayА.get(i - positionA) < arrayB.get(i - positionB)) {
                //arrayC[i] = arrayA[i - positionA];
                arrayC.add(i, arrayА.get(i - positionA));
                positionB++;
            } else {
                //arrayC[i] = arrayB[i - positionB];
                arrayC.add(i, arrayB.get(i - positionA));
                positionA++;
            }
        }
        return arrayC;
    }
*/

/*
    public static int [] merge_sort(int up, int down, int left, int right){

        *
         * Сортирует массив, используя рекурсивную сортировку слиянием
         * up - указатель на массив, который нужно сортировать
         * down - указатель на массив с, как минимум, таким же размером как у 'up', используется как буфер
         * left - левая граница массива, передайте 0, чтобы сортировать массив с начала
         * right - правая граница массива, передайте длину массива - 1,
         * чтобы сортировать массив до последнего элемента
         * возвращает: указатель на отсортированный массив. Из-за особенностей работы данной реализации
         * отсортированная версия массива может оказаться либо в 'up', либо в 'down'
         *

        if (left == right)
        {
            down[left] = up[left];
            return down;
        }

        int middle = left + (right - left) / 2;

        // разделяй и сортируй
        int l_buff = merge_sort(up, down, left, middle);
        int r_buff = merge_sort(up, down, middle + 1, right);

        // слияние двух отсортированных половин
        int target = l_buff == up ? down : up;

        int l_cur = left, r_cur = middle + 1;
        for (int i = left; i <= right; i++)
        {
            if (l_cur <= middle && r_cur <= right)
            {
                if (l_buff[l_cur] < r_buff[r_cur])
                {
                    target[i] = l_buff[l_cur];
                    l_cur++;
                }
                else
                {
                    target[i] = r_buff[r_cur];
                    r_cur++;
                }
            }
            else if (l_cur <= middle)
            {
                target[i] = l_buff[l_cur];
                l_cur++;
            }
            else
            {
                target[i] = r_buff[r_cur];
                r_cur++;
            }
        }
        return target;
    }
*/


}

