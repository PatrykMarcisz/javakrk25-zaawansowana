package patryk.zadania.ex3;

import java.util.Objects;

//Utwórz klasę UczenSzkoly, dziedziczącą po klasie Uczen,
public class UczenSzkoly extends Uczen {

    //klasa zawiera dodatkowe pole nazwaSzkoly
    private String nazwaSzkoly;

    //    b. posiada konstruktor wykorzystujący konstruktor klasy nadrzędnej
    public UczenSzkoly(String imie, String nazwisko, String pesel, String nazwaSzkoly) {
        super(imie, nazwisko, pesel);
        this.nazwaSzkoly = nazwaSzkoly;
    }

    public UczenSzkoly(UczenSzkoly uczenSzkoly){
        super(uczenSzkoly);
        this.nazwaSzkoly = uczenSzkoly.nazwaSzkoly;
    }

    public UczenSzkoly(Uczen uczen, String nazwaSzkoly){
        super(uczen);
        this.nazwaSzkoly = nazwaSzkoly;
    }

    public UczenSzkoly(Osoba osoba, String nazwaSzkoly){
        super(osoba);
        this.nazwaSzkoly = nazwaSzkoly;
    }

    //    c. klasa zawiera metodę zmienSzkole(), która pozwala na zmianę szkoły przez ucznia (wartości pola nazwaSzkoly w klasie UczenSzkoly)
    public void zmienSzkole(String nazwaSzkoly) {
        this.nazwaSzkoly = nazwaSzkoly;
    }

    //    d. nadpisz metody toString() oraz equals()
    @Override
    public String toString() {
        return "UczenSzkoly{ " +
                super.toString() + " " +
                "nazwaSzkoly='" + nazwaSzkoly + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UczenSzkoly that = (UczenSzkoly) o;
        return Objects.equals(nazwaSzkoly, that.nazwaSzkoly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nazwaSzkoly);
    }
}
