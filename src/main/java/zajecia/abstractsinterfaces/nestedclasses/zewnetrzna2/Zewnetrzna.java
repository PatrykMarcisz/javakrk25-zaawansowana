package zajecia.abstractsinterfaces.nestedclasses.zewnetrzna2;

public class Zewnetrzna {

    private int a;
    private int b;
    private Wewnetrzna wewnetrzna;

    public Zewnetrzna(int a, int b) {
        this.a = a;
        this.b = b;
        this.wewnetrzna = new Wewnetrzna();
    }

    public Wewnetrzna getWewnetrzna() {
        return wewnetrzna;
    }

    public void setWewnetrzna(Wewnetrzna wewnetrzna) {
        this.wewnetrzna = wewnetrzna;
    }

    public double sum(){
        Wewnetrzna wewnetrzna = new Wewnetrzna();
        wewnetrzna.x = 1;
        wewnetrzna.y = 2;
        wewnetrzna.z = 3;
        //nie zadziala return a + b + x + y + z;
        return a + b + wewnetrzna.x + wewnetrzna.y + wewnetrzna.z;
    }

    public class Wewnetrzna {
        private int x;
        private int y;
        private int z;

        public double multiply(){
            return x * y * z * a * b;
        }
    }

}
