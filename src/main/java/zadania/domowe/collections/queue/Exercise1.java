package zadania.domowe.collections.queue;


import java.util.ArrayDeque;
import java.util.Queue;

public class Exercise1 {
    public static void main(String[] args) {
        Queue<String> stringQueue = new ArrayDeque<String>();

        stringQueue.offer("pierwszy");
        System.out.println(stringQueue);

        stringQueue.offer("drugi");
        System.out.println(stringQueue);

        String headElement = stringQueue.peek();
        System.out.println(headElement);
        System.out.println(stringQueue);

        headElement = stringQueue.poll();
        System.out.println(headElement);
        System.out.println(stringQueue);

        stringQueue.clear();

        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.remove());

    }
}
