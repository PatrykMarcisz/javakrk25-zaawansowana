package zajecia.abstractsinterfaces;

public class Cringe {

    private int anInt = 5;

    class InnerCringe {
        private int anInt = 10;

        class InnerInnerCringe {
            private int anInt = 15;

            public void allTheX() {
                System.out.println(anInt);
                System.out.println(this.anInt);
                System.out.println(InnerCringe.this.anInt);
                System.out.println(Cringe.this.anInt);
            }
        }
    }

    public static void main(String[] args) {
        Cringe a = new Cringe();
        InnerCringe b = a.new InnerCringe();
        InnerCringe.InnerInnerCringe c = b.new InnerInnerCringe();
        c.allTheX();
    }
}