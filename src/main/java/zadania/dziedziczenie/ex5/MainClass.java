package zadania.dziedziczenie.ex5;

class A{
    String s = "class A";
}

 class B extends A {
    String s = "class B";
     {
         System.out.println(super.s);
     }
 }

 class C extends B {
    String s = "class C";
     {
         System.out.println(super.s);
     }
 }

public class MainClass {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.s);
    }
}
