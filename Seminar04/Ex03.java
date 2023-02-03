import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex03 {
    /*
    1) Написать метод, который принимает массив элементов, помещает их в стэк
    и выводит на консоль содержимое стэка.
    2) Написать метод, который принимает массив элементов, помещает их в
    очередь и выводит на консоль содержимое очереди.
     */
    public static void main(String[] args) {

        Integer[] arr = {5, 6, 7, 3, 4, 6, 6};
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>(); // очередь
        Collections.addAll(stack, arr);  // добавить из arr в stack.
        Collections.addAll(queue, arr);
        PrintStack(stack);
        System.out.println("\n");
        PrintQueue(queue);

    }

    public static void PrintStack(Stack<Integer> stack) {
        while (!stack.isEmpty()) { // пока stack пустой
            System.out.print(stack.pop());
        }
    }

    public static void PrintQueue(Queue<Integer> queue) {
        while (!queue.isEmpty()) {
            System.out.print(queue.remove());  // удаляем последний элемент
        }
    }
}
