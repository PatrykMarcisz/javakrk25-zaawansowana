package zadania.domowe.time.localtime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalTimeTest {

    public static void main(String[] args) {
        System.out.println("-----ex1");
        ex1();
        System.out.println("-----ex2");
        ex2();
        System.out.println("-----ex3");
        ex3();
        System.out.println("-----ex4");
        ex4();
        System.out.println("-----ex5");
        ex5();
        System.out.println("-----ex6");
        ex6();
        System.out.println("-----ex7");
        ex7();
        System.out.println("-----ex8");
        ex8();
        System.out.println("-----ex8");
        ex8();
        System.out.println("-----ex8");
        ex8();
        System.out.println("-----ex9");
        ex9();
        System.out.println("-----ex10");
        ex10();
        System.out.println("-----ex11");
        ex11();
    }

    private static void ex1(){
        LocalTime time = LocalTime.now();
        System.out.println(time);
    }

    private static void ex2(){
        LocalTime timeOf = LocalTime.of(12, 45);
        System.out.println(timeOf);
    }

    private static void ex3(){
        LocalDateTime dateTime = LocalDateTime.of(2001, 2, 24, 7, 15);
        LocalTime fromDateTime = LocalTime.from(dateTime);  //tworzymy localTime na podstawie istniejacego LocalDateTime,
                                                            //metoda from wybierze odpowiadajacy jej format, tj. wezmie godzine 17:15
                                                            //z obiektu localdatetime i wstawi ja do localtime

        LocalTime fromLocalTime = LocalTime.from(fromDateTime); //analogicznie do powyzszego

        System.out.println(dateTime);
        System.out.println(fromDateTime);
        System.out.println(fromLocalTime);
    }

    private static void ex4(){
        String source = "23:50:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime timeFromString = LocalTime.parse(source, formatter);

        System.out.println(timeFromString);
    }

    private static void ex5(){
        String source = "Od poczatku dnia minelo: 15 godzin, 7 minut, 50 sekund";
        String pattern = "'Od poczatku dnia minelo:' H 'godzin, 'm' minut, 's' sekund'";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        LocalTime timeFromPattern = LocalTime.parse(source, formatter);
        System.out.println(timeFromPattern);
    }

    private static void ex6(){
        String source1 = "10:15:30+01:00";
        String source2 = "10:15:30";
        //tutaj sie pomylilem, nie da sie wykorzystac ISO_DATE, poniewaz
        //przechowuje on typ daty, a nie godziny ktory trzyma LocalTime,
        //natomiast ISO_TIME jest poszukiwanym przez nas typem

        DateTimeFormatter format = DateTimeFormatter.ISO_TIME;

        System.out.println(LocalTime.parse(source1, format));
        System.out.println(LocalTime.parse(source2, DateTimeFormatter.ISO_TIME));
    }

    private static void ex7(){
        LocalTime now = LocalTime.now();
        DateTimeFormatter formatEx4 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter formatEx5 = DateTimeFormatter.ofPattern("'Od poczatku dnia minelo:' H 'godzin, 'm' minut, 's' sekund'");
        DateTimeFormatter formatEx6 = DateTimeFormatter.ISO_TIME;

        System.out.println(formatEx4.format(now));
        System.out.println(formatEx5.format(now));
        System.out.println(formatEx6.format(now));
    }

    private static void ex8(){
        LocalTime now = LocalTime.now();
        LocalTime inThePast = now.minusHours(3).minusMinutes(4).minusSeconds(30);
        LocalTime inThePast2 = now
                .minus(3, ChronoUnit.HOURS)
                .minus(4, ChronoUnit.MINUTES)
                .minus(30, ChronoUnit.SECONDS);

        System.out.println(inThePast);
        System.out.println(inThePast2);
    }

    private static void ex9(){
        LocalTime now = LocalTime.now();

        LocalTime inFuture = now.plusHours(3).plusMinutes(4).plusSeconds(30);
        LocalTime inFuture2 = now
                .plus(3, ChronoUnit.HOURS)
                .plus(4, ChronoUnit.MINUTES)
                .plus(30, ChronoUnit.SECONDS);

        System.out.println(inFuture);
        System.out.println(inFuture2);
    }

    private static void ex10(){
        System.out.println(LocalTime.NOON);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }

    private static void ex11(){
        System.out.println(LocalTime.now(ZoneId.of("Asia/Tokyo")));
    }

}
