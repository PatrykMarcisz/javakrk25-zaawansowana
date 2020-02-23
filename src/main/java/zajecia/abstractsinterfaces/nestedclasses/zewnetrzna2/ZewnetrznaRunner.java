package zajecia.abstractsinterfaces.nestedclasses.zewnetrzna2;

public class ZewnetrznaRunner {
    public static void main(String[] args) {
        Zewnetrzna zewnetrzna = new Zewnetrzna(1,2);
        Zewnetrzna.Wewnetrzna wewnetrzna = zewnetrzna.getWewnetrzna();
    }
}
