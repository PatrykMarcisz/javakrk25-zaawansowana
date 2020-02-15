package patryk.zadania.ex2;

//=== Zadanie 2
//1. Stwórz klasę Point2D, która zawiera dwa pola typu double: x oraz y;
//2. Utwórz dwa konstruktory obiektów tej klasy:
//
//a. jeden będzie ustawiał pola x oraz y na podstawie parametrów przekazanych przez użytkownika jako parametry konstruktora
//b. drugi będzie ustawiał pola x oraz y na podstawie wartości pól wyciągniętych z obiektu tej samej klasy, podanej jako parametr konstruktora
//
//3. Utwórz metody:
//    a. zwracające odpowiednio wartości pól x oraz y (getter / akcesor)
//    b. wyświetlające obiekt w formie string (toString)
//    c. porównujące obiekty między sobą (equals)
//
//4. Utwórz kilka obiektów tej klasy wykorzystując oba konstruktory
//
//5. Stwórz klasę Point3D, która rozszerza klasę Point2D rozszerzajac ją o jeden dodatkowy parametr: double z
//6. Dodaj do niej konstruktory bazujące na konstruktorach klasy point2D (konstruktor super())
//7. Nadpisz metody toString oraz equals dla klasy Point3D

import java.util.Objects;

public class Point2D extends Point {

    protected double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D(Point2D point){
        this.x = point.x;
        this.y = point.y;
    }

    public Point2D(Point2D point, double shiftX, double shiftY){
        this.x = point.x + shiftX;
        this.y = point.y + shiftY;
    }

    public double getX(){
        return this.x; //x
    }

    public double getY(){
        return y; //this.y
    }

    @Override
    public double distance(Point point){
//        if(point instanceof Point2D){
        if(this.getClass() == point.getClass()){
            Point2D other2D = (Point2D) point;
            //jakas logika obliczania odleglosci z punkted 2D
            return 10;
        }
        throw new RuntimeException("nie mozna obliczac odleglosci punktu 2d z innym typem");
    }

    @Override
    public String toString(){
        return super.toString() + " {x = " + x + ", y = " + y + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2D point2D = (Point2D) o;
        return Double.compare(point2D.x, x) == 0 &&
                Double.compare(point2D.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
