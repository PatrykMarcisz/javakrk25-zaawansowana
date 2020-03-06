package zajecia.streams.book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BookTest {
    public static void main(String[] args) {

    }

    //Wyświetl książki których autor ma ponad 50 la
    static void ex1() {
        books().stream()
                .filter(book -> book.getAuthor().getAge() > 50)
                .forEach(book -> System.out.println(book));
    }

    //Wyświetl książki których cena jest większa niż 30
    static void ex2() {
        List<Book> collect = books().stream()
                .filter(book -> book.getPrice() > 30)
                .collect(Collectors.toList());

        for (int i = 0; i < collect.size(); i++) {
            System.out.println(collect.get(i));
        }
    }

    //Wyświetl książki których cena jest mniejsza niż 50 oraz liczba stron
    //większa niż 300
    static void ex3() {
        Set<Book> results = books().stream()
                .filter(book -> book.getPrice() < 50)
                .filter(book -> book.getPages() > 300)
                .collect(Collectors.toSet());

        for (Book b : results) {
            System.out.println(b);
        }
    }

    //Wyświetl książki które należą do jednego z dwóch gatunków
// (wskazanych jako np. parametry funkcji, lub określone „na sztywno”)
// oraz autor ma ponad 30 la
    static void ex4() {
        BookType type1 = BookType.ADVENTURE;
        BookType type2 = BookType.SCIENCE;

        List<Book> collect = books().stream()
                .filter(book -> book.getType().contains(type1)
                        || book.getType().contains(type2))
                .filter(book -> book.getAuthor().getAge() > 30)
                .collect(Collectors.toList());

        Iterator<Book> it =  collect.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

    static List<Book> books() {
        ArrayList<Book> books = new ArrayList<>();
        return books;
    }
}
