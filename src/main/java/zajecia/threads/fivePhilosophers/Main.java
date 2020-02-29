package zajecia.threads.fivePhilosophers;

public class Main {

    public static void main(String args[]) throws InterruptedException {
        final Philosopher[] philosophers = new Philosopher[5];
        Fork[] forks = new Fork[philosophers.length];
        Thread[] threads = new Thread[philosophers.length];
        int destMealCounter = 10;

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Fork(i);
        }

        for (int i = 0; i < philosophers.length; i++) {
            Fork leftFork = forks[i];
            Fork rightFork = forks[(i + 1) % forks.length];

            System.out.println(
                    String.format("PHILOSOPHER %s : " +
                                    "left fork: %d, right fork: %d",
                                    i, i, (i + 1) % forks.length));

            if (i == philosophers.length - 1) {
                // The last philosopher picks up the right fork first
                philosophers[i] =
                        new Philosopher(destMealCounter, rightFork, leftFork);
            } else {
                philosophers[i] =
                        new Philosopher(destMealCounter, leftFork, rightFork);
            }

            threads[i] =
                    new Thread(philosophers[i], "PHILOSOPHER " + (i + 1));
        }

        long start = System.currentTimeMillis();
        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println(System.currentTimeMillis() - start + "ms");

    }
}



