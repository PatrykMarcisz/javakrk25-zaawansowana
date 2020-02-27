package zadania.domowe.streams.part2;

import java.util.*;
import java.util.stream.Collectors;

public class Part2Solutions {
    public static void main(String[] args) {
        System.out.println("---------ex1");
        ex1();
        System.out.println("---------ex2");
        ex2();
        System.out.println("---------ex3");
        ex3();
        System.out.println("---------ex4");
        ex4();
        System.out.println("---------ex5");
        ex5();
        System.out.println("---------ex6");
        ex6();
        System.out.println("---------ex7");
        ex7();
        System.out.println("---------ex8");
        ex8();
    }

    //1. Z listy osób wypisać imię i nazwisko osób, których wiek jest większy od 20 lub wzrost jest większy niż 1.75.
    private static void ex1() {
        List<String> persons = getPersons().stream()
                .filter(person -> person.getAge() > 20 || person.getHeight() > 1.75)
                .map(person -> person.getName() + " " + person.getSurname())
                .collect(Collectors.toList());

        persons.forEach(System.out::println);

        //alternatywnie
        getPersons().stream()
                .filter(person -> person.getAge() > 20 || person.getHeight() > 1.75)
                .forEach(person -> System.out.println(person.getName() + " " + person.getSurname()));
    }

    //2. wyfiltrować osoby tak, żeby zostały osoby o wieku mniejszym niż 18.
    // Następnie przypisać do zmiennej typu List<String> imię oraz nazwiska tych osób.
    private static void ex2() {
        List<String> persons = getPersons().stream()
                .filter(person -> person.getAge() < 18)
                .map(person -> person.getName() + " " + person.getSurname())
                .collect(Collectors.toList());
        persons.forEach(System.out::println);
    }

    //3. Sprawdź, czy w liście osób istnieje osoba o nazwisku "Kowalski"
    private static void ex3() {
        boolean isKowalski = getPersons().stream()
                .anyMatch(person -> person.getSurname().equalsIgnoreCase("Kowalski"));

        System.out.println(isKowalski);

        //alternatywnie
        isKowalski = getPersons().stream()
                .filter(person -> person.getSurname().equalsIgnoreCase("Kowalski"))
                .count() > 0;

        System.out.println(isKowalski);
    }

    //4. Sprawdź, czy w liście osób wszystkie osoby mają mniej niż 2 metry wzrostu.
    private static void ex4() {
        boolean allOver2Meters = getPersons().stream()
                .allMatch(person -> person.getHeight() > 2.0f);

        System.out.println(allOver2Meters);
    }

    //5. Posortuj listę osób w następujący sposób - pierw nazwisko alfabetycznie rosnąco, następnie imię.
    private static void ex5() {
        Comparator<Person> bySurnameThenName = Comparator.comparing(Person::getSurname)
                .thenComparing(Person::getName);

        List<Person> personList = getPersons().stream()
                .sorted(bySurnameThenName)
                .collect(Collectors.toList());

        personList.forEach(System.out::println);

        //lub klasycznie bez streamow, ale wowczas modyfikujemy zrodlowa liste,
        //w przypadku streamow zwracamy nowa

        //metoda getPersons zwraca listy typu niemodyfikowalnego, musimy stworzyc nowa na podstawie tamtej
        List<Person> persons = new ArrayList<>(getPersons());

        //klasyczny sort na liscie
        persons.sort(bySurnameThenName);

        //lub metoda collections.sort() gdzie wskazujemy na czym i jak dokonac sortowania
        Collections.sort(persons, bySurnameThenName);
    }

    //6. Posortuj listę list liczb całkowitych za pomocą sumy ich elementów.
    private static void ex6() {
        List<Integer> firstList = Arrays.asList(50, 100, 150, 200);
        List<Integer> secondList = Arrays.asList(5, 10, 15, 20);
        List<Integer> thirdList = Arrays.asList(35, 70, 15, 20);

        List<List<Integer>> listOfList = Arrays.asList(firstList, secondList, thirdList);

        List<List<Integer>> sortedBySum = listOfList.stream()
                .sorted(Comparator.comparing(integers -> integers.stream().mapToInt(Integer::intValue).sum()))
                .collect(Collectors.toList());

        sortedBySum.forEach(System.out::println);

        System.out.println();
        //malejaco

        List<List<Integer>> sortedBySumDesc = listOfList.stream()
                .sorted(
                        Collections.reverseOrder(
                                //obudowujemy wczesniejszy comparator w Collections.reverseOrder
                                //ktory pod spodem wyciaga nasza metode compare (a,b) i wykonuje compare (b,a) :)
                                Comparator.comparing(integers -> integers.stream().mapToInt(Integer::intValue).sum())
                        )
                )
                .collect(Collectors.toList());

        sortedBySumDesc.forEach(System.out::println);
    }

    //7. Skonwertować listę do mapy, której kluczem będzie imię i nazwisko, a wartością będzie wiek osoby. (wygooglować sposób konwersji strumienia na mapę).
    private static void ex7() {
        //jesli nie bedzie konfliktow, to wystarczy nam Collectors.toMap() dwuargumentowy
        Map<String, Integer> map = getPersons().stream()
                .collect(Collectors.toMap(
                        key -> key.getName() + " " + key.getSurname(),
                        value -> value.getAge()));

        map.forEach((x, y) -> System.out.println("key: " + x + " value " + y));


        //w innym przypadku musimy uzyc konstruktora trojargumentowego
        List<Person> listWithConflict = new ArrayList<>(getPersons());
        listWithConflict.add(new Person("Patryk", "Marcisz", 18, 1.80f));
        //mozemy wskazac ktora wartosc ma zostac uzyta w razie konfliktu

        Map<String, Integer> map2 = listWithConflict.stream()
                .collect(Collectors.toMap(
                        key -> key.getName() + " " + key.getSurname(),
                        value -> value.getAge(),
                        (oldValue, newValue) -> oldValue));

        System.out.println("---map2---");
        map2.forEach((x, y) -> System.out.println("key: " + x + " value " + y));
        //lub zmienic typ zwracany na liste wartosci gdzie bedziemy przechowywac zduplikowane wartosci

        Map<String, List<Integer>> map3 = listWithConflict.stream()
                .collect(Collectors.toMap(
                        key -> key.getName() + " " + key.getSurname(),
                        value -> new ArrayList<>(Arrays.asList(value.getAge())),
                        (oldVal, newVal) -> {
                            List<Integer> list = new ArrayList<>(oldVal);
                            list.addAll(newVal);
                            return list;
                        }));

        System.out.println("---map3---");
        map3.forEach((x, y) -> System.out.println("key: " + x + " value " + y));

    }

    //8. Skonwertować listę do mapy, której kluczem będzie imię, a wartością będzie zbiór osób o tym imieniu.
    private static void ex8() {
        Map<String, List<Person>> personListByName = getPersons().stream()
                .collect(Collectors.toMap(
                        key -> key.getName(),
                        value -> new ArrayList<>(Arrays.asList(value)),
                        (oldVal, newVal) -> {
                            List<Person> list = new ArrayList<>(oldVal);
                            list.addAll(newVal);
                            return list;
                        }
                ));

        personListByName.forEach((x, y) -> System.out.println("key: " + x + " value " + y));

    }

    private static List<Person> getPersons() {
        return Arrays.asList(
                new Person("Patryk", "Marcisz", 28, 1.75f),
                new Person("Adam", "Nowak", 45, 1.70f)
        );
    }
}
