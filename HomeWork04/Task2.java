import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task2 {
    /*
    Реализуйте очередь с помощью LinkedList со следующими методами:
    enqueue() - помещает элемент в конец очереди,
    dequeue() - возвращает первый элемент из очереди и удаляет его,
    first() - возвращает первый элемент из очереди, не удаляя.
     */
    public static void main(String[] args) {
        int lengthArray = 10;
        List<Integer> list = FillLinkedList(lengthArray);
        System.out.println("Origin array");
        PrintList(list);
        System.out.println();

        enqueue(list, 5);
        System.out.println("enqueue");
        PrintList(list);
        System.out.println();

        int dequeueNumber = dequeue(list);
        System.out.println("dequeue: ");
        System.out.print("First element: ");
        System.out.println(dequeueNumber);

        PrintList(list);
        System.out.println();

        int firstNumber = first(list);
        System.out.print("first: ");
        System.out.println(firstNumber);
    }

    public static List<Integer> FillLinkedList(int lengthArray) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < lengthArray; i++) {
            list.add(i);
        }
        return list;
    }

    public static void PrintList(List<Integer> list) {
        for (Integer x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static List<Integer> enqueue(List<Integer> list, int number) {
        list.add(number);
        return list;
    }

    public static int dequeue(List<Integer> list) {
        int length = list.size();
        int firstElement = list.get(0);
        for (int i = 1; i < length; i++) {
            list.set(i-1, list.get(i));
        }
        list.remove(length-1);
        return firstElement;
    }

    public static int first(List<Integer> list) {
        return list.get(0);
    }

}
