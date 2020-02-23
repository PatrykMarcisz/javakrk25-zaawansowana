package zajecia.abstractsinterfaces;


import static java.lang.Math.pow;

import zajecia.abstractsinterfaces.OtoczkaStatycznej.Statyczna;
import static zajecia.abstractsinterfaces.OtoczkaStatycznej.Statyczna;

public class OtoczkaStatycznejRunner {
    public static void main(String[] args) {
        pow(20, 30); //przyklad importu statycznego
        OtoczkaStatycznej otoczka = new OtoczkaStatycznej(30, 20);

        Statyczna wewnetrzna = new Statyczna(40);

        System.out.println(wewnetrzna.getOtoczkaStatycznaInt(otoczka));
        System.out.println(otoczka.getStaticInt(wewnetrzna));
        System.out.println(otoczka.getX());
        System.out.println(otoczka.getXx());
        System.out.println(wewnetrzna.getX());

        OtoczkaStatycznej.Statyczna stat2 = new OtoczkaStatycznej.Statyczna(40);
        //tak tez mozna stworzyc obiekt tej klasy
    }
}
