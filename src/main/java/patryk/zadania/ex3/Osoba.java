package patryk.zadania.ex3;

import java.util.Objects;

//1. Stwórz klasę Osoba, która zawiera następujące pola:
//    a. Imie
//    b. Nazwisko
//    c. Pesel (możesz użyć programu do walidacji peselu, aby sprawdzić czy podany pesel jest poprawny ;)
public class Osoba {
    private String imie;
    private String nazwisko;
    private String pesel;

    //2. Zdefiniuj konstruktor dla tej klasy, przyjmujący 3 wspomniane wyżej parametry oraz metody

    public Osoba(String imie, String nazwisko, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public Osoba(Osoba osoba){
        this.imie = osoba.imie;
        this.nazwisko = osoba.nazwisko;
        this.pesel = osoba.pesel;
    }

    //    a. przedstawSie() zwracający imię i nazwisko w formie String
    public String przedstawSie(){
        return imie + " " + nazwisko;
    }

    //    b. nadpisz metodę toString() z klasy Object
    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }

    //    c. nadpisz metodę equals() z klasy Object
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(imie, osoba.imie) &&
                Objects.equals(nazwisko, osoba.nazwisko) &&
                Objects.equals(pesel, osoba.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, pesel);
    }
}
