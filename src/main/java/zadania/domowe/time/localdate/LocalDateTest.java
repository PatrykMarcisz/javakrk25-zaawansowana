package zadania.domowe.time.localdate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTest {
    public static void main(String[] args) {
        System.out.println("-------ex1");
        ex1();
        System.out.println("-------ex2");
        ex2();
        System.out.println("-------ex3");
        ex3();
        System.out.println("-------ex4");
        ex4();
        System.out.println("-------ex5");
        ex5();
        System.out.println("-------ex6");
        ex6();
        System.out.println("-------ex7");
        ex7();
        System.out.println("-------ex8");
        ex8();
        System.out.println("-------ex9");
        ex9();
        System.out.println("-------ex10");
        ex10();
        System.out.println("-------ex11");
        ex11();
        System.out.println("-------ex12");
        ex12();
        System.out.println("-------ex13");
        ex13();
        System.out.println("-------ex14");
        ex14();
        System.out.println("-------ex15");
        ex15();
        System.out.println("-------ex16");
        ex16();
        System.out.println("-------ex17");
        ex17();
    }

    private static void ex1() {
        LocalDate date = LocalDate.now();
        System.out.println(date);
    }

    private static void ex2() {
        LocalDate date = LocalDate.of(2019, 12, 8);
        System.out.println(date);
    }

    private static void ex3() {
        LocalDateTime localDateTime = LocalDateTime.of(2019, 12, 8, 12, 30);
        LocalDate localDate = LocalDate.of(2019, 12, 8);

        LocalDate fromLocalDateTime = LocalDate.from(localDateTime);
        LocalDate fromLocalDate = LocalDate.from(localDate);

        System.out.println(fromLocalDateTime);
        System.out.println(fromLocalDate);
    }

    private static void ex4() {
        String input = "19.11.2019";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.y");

        LocalDate fromString = LocalDate.parse(input, formatter);
        System.out.println(fromString);
    }

    private static void ex5() {
        String input = "11.19.2019";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M.d.y");

        LocalDate date = LocalDate.parse(input, formatter);
        System.out.println(date);
    }

    private static void ex6() {
        String input = "2019-11-19";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("y-M-d");

        LocalDate fromString = LocalDate.parse(input, formatter);
        System.out.println(fromString);
    }

    private static void ex7() {
        String input = "Dzisiaj mamy 20 dzień miesiąca 2 roku 2010";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Dzisiaj mamy' d 'dzień miesiąca' M 'roku' y");

        LocalDate fromString = LocalDate.parse(input, formatter);
        System.out.println(fromString);
    }

    private static void ex8() {
        String inputISO_DATE = "2011-12-03";
        String inputISO_DATE_2 = "2011-12-03+01:00";
        DateTimeFormatter formatter_ISO_DATE = DateTimeFormatter.ISO_DATE;

        System.out.println(LocalDate.parse(inputISO_DATE, formatter_ISO_DATE));
        System.out.println(LocalDate.parse(inputISO_DATE_2, DateTimeFormatter.ISO_DATE));

        String inputBASIC_ISO_DATE = "20111203";
        DateTimeFormatter formatter_BASIC_ISO_DATE = DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println(LocalDate.parse(inputBASIC_ISO_DATE, formatter_BASIC_ISO_DATE));

        String inputISO_ORDINAL_DATE = "2012-337";
        DateTimeFormatter formatter_ISO_ORDINAL_DATE = DateTimeFormatter.ISO_ORDINAL_DATE;
        System.out.println(LocalDate.parse(inputISO_ORDINAL_DATE, formatter_ISO_ORDINAL_DATE));
    }

    private static void ex9() {
        LocalDate date = LocalDate.of(2019, 12, 6);

        System.out.println("ex4 format: " + DateTimeFormatter.ofPattern("d.M.y").format(date));
        System.out.println("ex5 format: " + DateTimeFormatter.ofPattern("M.d.y").format(date));
        System.out.println("ex6 format: " + DateTimeFormatter.ofPattern("y-M-d").format(date));
        System.out.println("ex7 format: " + DateTimeFormatter.ofPattern("'Dzisiaj mamy' d 'dzień miesiąca' M 'roku' y").format(date));

        System.out.println("ex8:1 format: " + DateTimeFormatter.ISO_DATE.format(date));
        System.out.println("ex8:2 format: " + DateTimeFormatter.BASIC_ISO_DATE.format(date));
        System.out.println("ex8:3 format: " + DateTimeFormatter.ISO_ORDINAL_DATE.format(date));
    }

    private static void ex10() {
        LocalDate birthday = LocalDate.of(1992, 2, 24);
        System.out.println(birthday.getDayOfWeek());
        System.out.println(birthday.getDayOfYear());
    }

    private static void ex11() {
        LocalDate birthday = LocalDate.of(1992, 2, 24);
        LocalDate nextMondayAfterBirthday = birthday.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        LocalDate previousMondayBeforeBirthday = birthday.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));

        System.out.println(nextMondayAfterBirthday);
        System.out.println(previousMondayBeforeBirthday);
    }

    private static void ex12() {
        LocalDate birthday = LocalDate.of(1992, 2, 24);
        LocalDate now = LocalDate.now();

        long daysFromBirthday = ChronoUnit.DAYS.between(birthday, now);
        System.out.println(daysFromBirthday);

        long monthsFromBirthday = ChronoUnit.MONTHS.between(birthday, now);
        System.out.println(monthsFromBirthday);

//        long secondsFromBirthday = ChronoUnit.SECONDS.between(birthday, now);
//        System.out.println(secondsFromBirthday);

        //jednostka czasu sekunda nie jest wspierana jako jednostka daty, w zwiazku
        //z czym nie mozemy jej tutaj uzyc
    }

    private static void ex13() {
        LocalDate birthday = LocalDate.of(1992, 2, 24);
        LocalDate beginOfBirthdayWeek = birthday.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        LocalDate endOfBirthdayWeek = birthday.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));

        System.out.println("birthday week from " + beginOfBirthdayWeek + " to " + endOfBirthdayWeek);
    }

    private static void ex14() {
        LocalDate birthday = LocalDate.of(1992, 2, 24);
        LocalDate now = LocalDate.now();

        Period lifeTime = Period.between(birthday, now);
        System.out.println("actual lifetime");
        System.out.println(lifeTime.getYears());
        System.out.println(lifeTime.getMonths());
        System.out.println(lifeTime.getDays());

        //pension -> emerytura
        Period pension = Period.of(65, 0, 0);
        Period toPension = pension.minus(lifeTime);

        System.out.println("to pension left: ");
        System.out.println(toPension.getYears());
        System.out.println(toPension.getMonths());
        System.out.println(toPension.getDays());

        //tak by podpowiadala intuicja ze nalezy to zrobic w ten sposob, ale
        //w tym zadaniu period.minus() nie zadzialal tak jak zakladalem,
        // trzeba zrobic to inaczej

        //obliczamy date emerytury
        LocalDate pensionDate = birthday.plusYears(65);
        //obliczamy period pomiedzy teraz a data emerytury
        Period fromNowToPension = Period.between(LocalDate.now(), pensionDate);

        System.out.println(fromNowToPension.getYears());
        System.out.println(fromNowToPension.getMonths());
        System.out.println(fromNowToPension.getDays());
    }

    private static void ex15() {
        LocalDate firstDayOf2030 = LocalDate.ofYearDay(2030, 1);
        LocalDate firstDayOfSeventhWeek = firstDayOf2030.with(TemporalAdjusters.next(DayOfWeek.MONDAY)).plusWeeks(5);
        System.out.println(firstDayOfSeventhWeek);
    }

    private static void ex16() {
        LocalDate iterationDate = LocalDate.now();
        while (iterationDate.isBefore(LocalDate.now().plusMonths(2))) {
            boolean isWeekend = iterationDate.getDayOfWeek().equals(DayOfWeek.SATURDAY)
                    || iterationDate.getDayOfWeek().equals(DayOfWeek.SUNDAY);

            if (!isWeekend) {
                System.out.println(iterationDate);
            }
            iterationDate = iterationDate.plusDays(2);
        }
    }

    private static void ex17() {
        System.out.println(LocalDate.now().minusYears(3).minusMonths(2).minusDays(4));
    }
}
