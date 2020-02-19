package patryk.zadania.ex3;

//3. Utwórz klasę Uczen, dziedziczaca po klasie Osoba
public class Uczen extends Osoba {
    public Uczen(String imie, String nazwisko, String pesel) {
        super(imie, nazwisko, pesel);
    }

    public Uczen(Uczen uczen){
        super(uczen);
    }

    public Uczen(Osoba osoba){
        super(osoba);
    }
}
