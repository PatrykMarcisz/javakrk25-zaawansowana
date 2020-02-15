package zadania.ex10;

public class MainCLass {
    public static void main(String[] args) {
        X x = new Y(5);
        System.out.println(x.i);
    }
}

class X {
    int i;

    public X(int i) {
        this.i = i;
        System.out.println(1);
    }
}

class Y extends X {

    public Y(int i) {
        super(i);
        System.out.println(2);
    }
}
