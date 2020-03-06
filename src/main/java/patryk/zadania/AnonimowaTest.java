package patryk.zadania;

public class AnonimowaTest {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("run");
            }

            private void mojaMetoda2(){
                System.out.println("moja metoda 2");
            }

            public void mojaMetoda(){
                System.out.println("moja metoda");
            }
        };

        Runnable runnable2 = () -> System.out.println("run");

        class OurRunnable implements Runnable {




            @Override
            public void run() {

            }

        }

        OurRunnable ourLocalClass = new OurRunnable();
        ourLocalClass.run();

        //(NazwaKlasyAnonimowej)runnable; //nie da sie rzutowac w dol, bo nie ma nazwy i jest anonimowa
        //
        }
}
