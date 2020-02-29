package zajecia.threads.simpleThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadRunner {
    public static void main(String[] args) throws InterruptedException {
        CustomThread thread = new CustomThread("no siemaneczko");
        Runnable thread2 = () -> {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("watek z interfejsu runnable");
        };
        new Thread(thread2).start();
        thread.start();


        System.out.println("w głównym wątku");
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(thread);
        executorService.execute(thread2);
        executorService.execute(thread);
        executorService.execute(thread2);
        executorService.execute(thread);
        executorService.execute(thread2);
        executorService.execute(thread);
        executorService.execute(thread2);
        executorService.execute(thread);
        executorService.execute(thread2);
        System.out.println("w głównym wątku2");
        executorService.shutdown();
    }
}
