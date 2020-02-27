package zadania.dziedziczenie.ex3;


public class MainCLass {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A{
    {
        System.out.println(1);
    }
}

class B extends A{
    {
        System.out.println(2);
    }
}

class C extends B{
    {
        System.out.println(3);
    }
    // blok konstruowania obiektu wywolywany przed wywolaniem konstruktora,
    // podczas tworzenia obiektow

    //zeby stworzyc obiekt klas C, najpierw musimy stworzyc obiekt klasy B,
    //zeby stworzyc obiekt klasy B, najpierw musimy stworzyc obiekt klasy A
    //zeby stworzyc obiekt klasy A, najpierw musimy stworzyc obiekt klasy Object

    //
}

