package patryk.zadania.ex3;

public class UczenSzkolyRunner {
    public static void main(String[] args) {
        UczenSzkoly uczenSzkoly = new UczenSzkoly("Patryk", "Marcisz", "12345", "PK");
        UczenKlasy uczenKlasy = new UczenKlasy(uczenSzkoly, "1");
    }
}
