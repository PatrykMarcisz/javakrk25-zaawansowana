package zajecia.abstractsinterfaces;

public class Calculator {
    private int length = 3;
    public void field() {
        /*final*/ int width = 20;
        /* jesli width bedzie za definicja klasy, klasa nie bedzie widziec tej zmiennej */

        class Multiplier {

            private void multiply() {
                System.out.println(length * width);
            }

        }

        /* width = 5; tak nie wolno, bo przestanie byc effectively final */
        Multiplier multiplier = new Multiplier();
        multiplier.multiply();
    }

    void setLength(int val){
        this.length = val;
    }
}