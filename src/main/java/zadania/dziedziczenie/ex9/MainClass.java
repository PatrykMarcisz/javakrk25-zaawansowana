package zadania.dziedziczenie.ex9;

class X{
    static {
        System.out.println("Static block in X");
    }
    static void staticMethod()    {
        System.out.println("Class X");
    }
}

class Y extends X{
    static void staticMethod()    {
        System.out.println("Class Y");
    }
}

public class MainClass{
    public static void main(String[] args) {
        Y.staticMethod();
        Y y = new Y();
    }
}
