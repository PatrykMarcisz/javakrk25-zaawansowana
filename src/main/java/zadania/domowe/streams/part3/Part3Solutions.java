package zadania.domowe.streams.part3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Part3Solutions {

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

    }

    //1. wyswietl ksiazki ktorych autor ma ponad 50 lat
    private static void ex1() {
        List<Book> books = getBooks().stream()
                .filter(x -> x.getAuthor().getAge() > 50)
                .collect(Collectors.toList());

        books.forEach(System.out::println);
    }

    //2. wyswietl ksiazki ktorych cena jest wieksza niz 30
    private static void ex2() {
        List<Book> books = getBooks().stream()
                .filter(x -> x.getPrice() > 30)
                .collect(Collectors.toList());

        books.forEach(System.out::println);
    }

    //3. wyswietl ksiazki, ktorych cena jest mniejsza niz 50 oraz liczba stron wieksza niz 300
    private static void ex3() {
        List<Book> books = getBooks().stream()
                .filter(x -> x.getPrice() > 50)
                .filter(x -> x.getPages() > 300) //filtr po filtrze == AND
                //.filter (x -> x.getPages() > 300 && x.price < 50) //alternatywnie
                .collect(Collectors.toList());

        books.forEach(System.out::println);
    }

    //4. wyswietl ksiazki ktore naleza do jednego z dwoch gatunkow oraz autor ma ponad 30 lat
    private static void ex4() {
        List<BookType> expectedTypes = Arrays.asList(BookType.THRILLER, BookType.ADVENTURE);
        List<Book> books = getBooks().stream()
                .filter(x -> {
                    for (BookType type : x.getType()) {
                        if (expectedTypes.contains(type)) {
                            return true;
                        }
                    }
                    return false;
                })
                .filter(x -> x.getAuthor().getAge() > 30)
                .collect(Collectors.toList());

        books.forEach(System.out::println);
    }

    //5. wyswietl ksiazki ktorych nazwa sklada sie wiecej niz jednego slowa
    private static void ex5() {
        List<Book> books = getBooks().stream()
                .filter(x -> x.getTitle().split("\\s+").length > 1)
                .collect(Collectors.toList());

        books.forEach(System.out::println);
    }

    //6. wyswietl ksiazki, sa sklasyfikowane do wiecej niz jednej kategorii
    private static void ex6() {
        List<Book> books = getBooks().stream()
                .filter(x -> x.getType().size() > 1)
                .collect(Collectors.toList());

        books.forEach(System.out::println);
    }

    //7. na podstawie listy ksiazek utworz liste typu String,
    // gdzie kazdy string przedstawi nastepujaco informacje:
    // imie i nazwisko autora, tytul i cena
    private static void ex7() {
        List<String> stringBooks = getBooks().stream()
                .map(x -> new StringBuilder()
                        .append(x.getAuthor().getName()).append(" ; ")
                        .append(x.getAuthor().getSurname()).append(" ; ")
                        .append(x.getTitle()).append(" ; ")
                        .append(x.getPrice())
                        .toString())
                .collect(Collectors.toList());

        stringBooks.forEach(System.out::println);
    }

    //8. wyswietl cene wszystkich ksiazek napisanych przez autora,
    // ktorego nazwisko rozpoczyna sie na 'B' oraz ma wiek > 50 lat
    private static void ex8() {
        Long sum = getBooks().stream()
                .filter(x ->
                        x.getAuthor().getSurname().startsWith("B")
                                || x.getAuthor().getSurname().startsWith("b"))
                .filter(x -> x.getAuthor().getAge() > 50)
                .map(Book::getPrice)
                .reduce(0L, (x, y) -> x + y);

        System.out.println(sum);
    }

    //9. posortuj liste ksiazek wedlug tytulow
    private static void ex9() {
        List<Book> books = getBooks().stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());

        books.forEach(System.out::println);
    }

    //10. posortuj liste ksiazek wedlug nazwiska autora
    private static void ex10() {
        List<Book> books = getBooks().stream()
                .sorted(Comparator.comparing(x -> x.getAuthor().getSurname()))
                .collect(Collectors.toList());

        books.forEach(System.out::println);
    }

    //11. wyswiwetl sume wszystkich stron z gatunku fantasy
    private static void ex11() {
        long sumOfPages = getBooks().stream()
                .filter(x -> x.getType().contains(BookType.FANTASY))
                .map(x -> x.getPages())
                .reduce(0L, (x,y) -> x + y);

        System.out.println(sumOfPages);
    }

    //12. wyswietl srednia ilosc stron z gatunku fantasy
    private static void ex12() {
        double averagePageNumber = getBooks().stream()
                .filter(x -> x.getType().contains(BookType.FANTASY))
                .mapToLong(x -> x.getPages())
                .average().orElse(-1.0);

        System.out.println(averagePageNumber);
    }

    //13. utworz mape, gdzie kluczem bedzie gatunek, a wartoscia lista ksiazek
    private static void ex13() {
    }

    private static List<Book> getBooks() {
        Author andrzejZiemianski = new Author("Andrzej", "Ziemianski", 59);
        Author andrzejNowak = new Author("Andrzej", "Nowak", 59);
        Author adamMickiewicz = new Author("Adam", "Mickiewicz", 30);
        Author markTwain = new Author("Mark", "Twain", 40);
        Author krzysztofBlogowski = new Author("Krzysztof", "Błogowski", 60);
        Author krzysztofBaczynski = new Author("Krzyszfor", "Baczynski", 25);
        return Arrays.asList(
                new Book(andrzejZiemianski, "Achaja", Arrays.asList(BookType.FANTASY, BookType.ADVENTURE), 300, 40),
                new Book(andrzejZiemianski, "Virion", Arrays.asList(BookType.FANTASY), 150, 30),
                new Book(andrzejNowak, "Dzieje Polski", Arrays.asList(BookType.SCIENCE), 400, 80),
                new Book(adamMickiewicz, "Pan Tadeusz", Arrays.asList(BookType.THRILLER, BookType.FANTASY), 200, 30),
                new Book(markTwain, "Przygody Tomka Sawyera", Arrays.asList(BookType.ADVENTURE), 100, 25),
                new Book(krzysztofBaczynski, "Wiersze wojenne", Arrays.asList(BookType.THRILLER), 20, 10),
                new Book(krzysztofBlogowski, "Wymyslona Ksiazka", Arrays.asList(BookType.SCIENCE), 400, 30)
        );
    }

    ;
}
