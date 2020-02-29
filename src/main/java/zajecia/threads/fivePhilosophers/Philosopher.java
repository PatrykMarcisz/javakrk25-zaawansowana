package zajecia.threads.fivePhilosophers;

public class Philosopher implements Runnable {

    Fork leftFork;
    Fork rightFork;
    int destinationMealCounter;

    public Philosopher(int destinationMealCounter,
                       Fork leftFork, Fork rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.destinationMealCounter = destinationMealCounter;
    }

    @Override
    public void run() {
        int localCounter = 0;
        while(++localCounter <= destinationMealCounter){
            think();
            synchronized(leftFork){
                pickUpLeftFork();
                synchronized(rightFork){
                    pickUpRightFork();
                    eat();
                    putDownRightFork();
                }
                putDownLeftFork();
            }
        }
    }

    private void pickUpLeftFork() {
        try {
            doAction("pick up left fork " + leftFork.getForkId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void pickUpRightFork() {
        try {
            doAction("pick up right fork " + rightFork.getForkId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void eat() {
        try {
            doAction("eating");
            long time = (long)(Math.random()*1000)+2000;
            Thread.sleep(time);
            doAction("end eating");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void putDownRightFork() {
        try {
            doAction("put down right fork " + rightFork.getForkId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void putDownLeftFork() {
        try {
            doAction("put down left fork " + leftFork.getForkId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void think() {
        try {
            long time = (long)(Math.random()*1000)+3000;
            Thread.sleep(time);
            doAction("thinking due " + time + " time");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void doAction(String action) throws InterruptedException {
        System.out.println(System.currentTimeMillis() + " " +
                Thread.currentThread().getName() + " " + action);
        Thread.sleep(((int) (Math.random() * 100)));
    }
}

