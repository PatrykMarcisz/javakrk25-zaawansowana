package patryk.zadania.ex1;

//=== Zadanie 1
//1. Stwórz klasę Member w pakiecie zadania.zadanie1, zawierającą prywatne pola:
//a. String name
//b. String email
//c. Integer id;
//2. Dodaj publiczny konstruktor ustawiający te 3 wartości
//3. Dodaj trzy metody publiczne typu get (akcesory), zwracające poszczególne pola klasy
//4. Stwórz klasę MainClass, w ramach której znajduje się metoda main, sprawdź poprawność działania powyższych metod
//5. Stwórz klasę Team, zawierającą pola:
//a. String name
//b. Member[] members
//6. Stwórz konstruktor, który będzie mógł być wykorzystany w celu stworzenia drużyny. Niech przyjmuje parametr name, oraz parametr typu varargs np. (Member ... members)
//7. Stwórz metody klasy Team, które zwracaja ilość osób w drużynie, oraz tablicę członków tej drużyny
//8. w klasie MainClass, utwórz kilku (3-4) członków drużyny, a następnie przy ich pomocy, stwórz obiekt typu Team. sprawdź działanie metod z punktu 7. Wypisz zawodników przy pomocy pętli for-each lub for, bazując na tablicy

public class Member {
    private String name;
    private String email;
    private int id;

    private static Integer common_id = 0;

    Member(String name, String email){
        this.name = name;
        this.email = email;
        id = ++common_id;
    }


    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }
}
