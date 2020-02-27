package zadania.dziedziczenie.ex11;

public class MainClass {
}

class A
{
    public A()
    {
        super();
        System.out.println(1);

        //super(); //nie mozemy umiescic super w innym miejscu niz pierwsza linia konstruktora
        // w pierwszej linii musi być super() lub this();
        // nie zawsze bedzie to jednak wywolanie konstruktora bezargumentowego,
        //patrz zadanie ex10

        System.out.println(2);
    }
}