package zadania.ex22;

class X {
    int i = 101010;

    public X() {
        i = i++ + i-- - i;
    }

    static int staticMethod(int i) {
        return --i;
    }
}

class Y extends X {
    public Y() {
        System.out.println(staticMethod(i));
    }
}

public class MainClass {
    public static void main(String[] args) {
        Y y = new Y();
        System.out.println(y.i);
    }
}