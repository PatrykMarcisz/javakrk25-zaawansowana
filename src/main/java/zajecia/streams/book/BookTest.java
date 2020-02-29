package zajecia.streams.book;

import java.util.ArrayList;
import java.util.List;
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
    static void ex2(){
        List<Book> collect = books().stream()
                .filter(book -> book.getPrice() > 30)
                .collect(Collectors.toList());

        for(int i=0; i<collect.size(); i++){
            System.out.println(collect.get(i));
        }
    }

    //Wyświetl książki których cena jest mniejsza niż 50 oraz liczba stron
    //większa niż 300
    static void ex3(){
//        books().stream()
//                .filter()
    }

    static List<Book> books() {
        ArrayList<Book> books = new ArrayList<>();
        return books;
    }
}
