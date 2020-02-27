package zadania.domowe.collections.queue;

import java.util.PriorityQueue;

public class Exercise2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priority = new PriorityQueue<>();
        priority.offer(5);
        priority.offer(2);
        priority.offer(2);
        priority.offer(4);
        priority.offer(8);
        while(priority.size() > 0){
            System.out.println(priority.poll());
        }
    }
}
