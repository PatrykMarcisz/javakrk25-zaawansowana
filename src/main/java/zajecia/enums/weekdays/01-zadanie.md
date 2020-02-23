###Zadanie 1
1. Napisz enum WeekDay, która reprezentuje poszczególne dni tygodnia
2. Dodaj do enuma pola MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY,
SUNDAY
3. Nie wykorzystując dodatkowych pól zdefiniowanych w klasie, napisz metodę określającą czy
dany dzień jest dniem roboczym (boolean isWorkDay())
4. Napisz metodę isHoliday(), która będzie zwracać negację metody isWorkDay
5. Stwórz klasę WeekDayDemo, w której umieścisz metodę main
6. Stwórz metodę testDay, przyjmującą jako parametr WeekDay, która jeśli dany dzień jest
dniem roboczym wyświetli komunikat „Go to work”, w innym przypadku wyświetli „Today
time for Rest”
7. Przy pomocy metody values() klasy WeekDay, wywołaj metodę testDay na każdym elemencie
enuma WeekDay
8. Sprawdź czy enum WeekDay implementuje interfejs Comparable:
*  Zadeklaruj w klasie WeekDayDemo metodę isGreaterThanSaturday przyjmującą
parametr typu WeekDay
* w ramach metody isGreaterThanSaturday zadeklaruj zmienną typu WeekDay i przypisz do niej wartość SATURDAY
* również w metodzie, wykonaj porównanie obiektu reprezentującego sobotę i przekazanego jako parametr
metody przy pomocy metody compareTo, wynik działania przypisz do zmiennej typu
int
* w funkcji main, w zależności od wartości porównania wypisz czy dany WeekDay jest większy,
mniejszy czy równy dniu SATURDAY. 
    * Jakie wartości zwraca stworzona funkcja w zależności od parametru ? 
    * dlaczego ?