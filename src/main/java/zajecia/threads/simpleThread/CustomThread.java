package zajecia.threads.simpleThread;

public class CustomThread extends Thread {
    private static int counter = 0;
    private String mojaNieszablonowaNazwa;

    public CustomThread(String mojaNieszablonowaNazwa) {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.mojaNieszablonowaNazwa = mojaNieszablonowaNazwa;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " " + mojaNieszablonowaNazwa + "[" + counter++ + "]");
    }
}
