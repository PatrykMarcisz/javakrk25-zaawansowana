Author
-----
````
    String name;
    String surname;
    long age;
````
booktype (enum)
-----
````
    ADVENTURE,
    THRILLER,
    SCIENCE,
    FANTASY,
````
book
-----
````
    Author author;
    String title;
    List<BookType> type;
    long pages;
    long price;
````

1. wyswietl ksiazki ktorych autor ma ponad 50 lat
2. wyswietl ksiazki ktorych cena jest wieksza niz 30
3. wyswietl ksiazki, ktorych cena jest mniejsza niz 50 oraz liczba stron wieksza niz 300
4. wyswietl ksiazki ktore naleza do jednego z dwoch gatunkow oraz autor ma ponad 30 lat
5. wyswietl ksiazki ktorych nazwa sklada sie wiecej niz jednego slowa
6. wyswietl ksiazki, sa sklasyfikowane do wiecej niz jednej kategorii
7. na podstawie listy ksiazek utworz liste typu String, gdzie kazdy string przedstawi nastepujaco informacje: imie i nazwisko autora, tytul i cena
8. wyswietl cene wszystkich ksiazek napisanych przez autora, ktorego nazwisko rozpoczyna sie na 'B' oraz ma wiek > 50 lat
9. posortuj liste ksiazek wedlug tytulow
10. posortuj liste ksiazek wedlug nazwiska autora
11. wyswiwetl sume wszystkich stron z gatunku fantasy
12. wyswietl srednia ilosc stron z gatunku fantasy
13. utworz mape, gdzie kluczem bedzie gatunek, a wartoscia lista ksiazek