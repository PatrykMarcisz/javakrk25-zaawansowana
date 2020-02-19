package patryk.zadania.ex3;

import java.util.Objects;

//Utworz klasę UczenKlasy, ktory dziedziczy po klasie UczenSzkoly
public class UczenKlasy extends UczenSzkoly {

    //klasa zaawiera dodatkowe pole : klasa
    private String klasa;

    //wykorzystuje konstruktor klasy nadrzędnej
    public UczenKlasy(String imie, String nazwisko, String pesel, String nazwaSzkoly, String klasa) {
        super(imie, nazwisko, pesel, nazwaSzkoly);
        this.klasa = klasa;
    }

    //Dla klasy UczenKlasy, stwórz konstruktory, które pozwalają stworzyć obiekt UczenKlasy, wykorzystując parametry konstruktora typów: UczenSzkoly, Uczen oraz Osoba + dodatkowe wymagane parametry
    public UczenKlasy(UczenSzkoly uczenSzkoly, String klasa){
        super(uczenSzkoly);
        this.klasa = klasa;
    }

    public UczenKlasy(Uczen uczen, String szkola, String klasa){
        super(uczen, szkola);
        this.klasa = klasa;
    }

    public UczenKlasy(Osoba osoba, String szkola, String klasa){
        super(osoba, szkola);
        this.klasa = klasa;
    }

    //    c. posiada metody getKlasa() pozwalającą pobrać nazwę klasy, oraz zmienKlase() zmieniajacą wartość pola klasa w UczenKlasy
    public String getKlasa() {
        return klasa;
    }

    public void zmienKlase(String klasa) {
        this.klasa = klasa;
    }

    @Override
    public String toString() {
        return "UczenKlasy{ " +
                super.toString() + " " +
                "klasa='" + klasa + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UczenKlasy that = (UczenKlasy) o;
        return Objects.equals(klasa, that.klasa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), klasa);
    }
}
