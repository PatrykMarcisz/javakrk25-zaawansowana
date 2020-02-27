package zadania.dziedziczenie.ex2;

class A{
    int i = 10;
}

class B extends A{
    int i = 20;

    public int getIFromB(){
        return i;
    }

    public int getIFromA(){
        return super.i;
    }
}

public class MainClass {
    public static void main(String[] args){
        A a  = new B();
        System.out.println(a.i);

        B b = new B();
        System.out.println(b.i);
        System.out.println(b.getIFromA());
        System.out.println(b.getIFromB());
    }
}
