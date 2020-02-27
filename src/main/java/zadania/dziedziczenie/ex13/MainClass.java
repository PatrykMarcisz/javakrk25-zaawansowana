package zadania.dziedziczenie.ex13;

public class MainClass {
}

class A
{
    public A(int i) {

    }
}

class B extends A {

//    public B(){   //domyslny konstruktor nawet jesli nie zadeklarujemy zadnego
//        super();  //ma taka forme
//    }

    public B(){
        super(10);
    }

    public B(int zmienna){
        super(zmienna);
    }

}