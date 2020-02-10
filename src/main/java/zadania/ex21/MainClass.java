package zadania.ex21;

class A {
    static String s = "AAA";

    static {
        s = s + "BBB";
    }

    {
        s = "AAABBB";
    }
}

class B extends A {
    static {
        s = s + "BBBAAA";
    }

    static void printS(){
        System.out.println(s);
    }

    {
        System.out.println(s);
    }
}

public class MainClass {
    public static void main(String[] args) {

        B.printS();
        System.out.println("------");
        B b = new B();
        System.out.println("------");
        B.printS();
    }
}