package zajecia.abstractsinterfaces;

public abstract class Figure implements Perimeterable {
    abstract double getField();

    public static void main(String[] args) {
        Perimeterable perCircle = new Circle(3);

        Figure circle = new Circle(2);
        Figure triangle = new Triangle(10, 2);

        System.out.println(circle.getField());
        System.out.println(triangle.getField());

        System.out.println("==================");

        printField(circle);
        printField(triangle);

        Perimeterable p1 = circle;
        p1.getPerimeter();

        Circle c = (Circle)circle;

    }

    static void printField(Figure figure){
        if(figure instanceof Circle){
            System.out.println("parametr r " + ((Circle)figure).r);
        }
        System.out.println(figure.getField());

    }

}

class Circle extends Figure {
    double r;
    public Circle(double r){
        this.r = r;
    }

    @Override
    public double getField(){
        return Math.PI * Math.pow(r,2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }
}

class Triangle extends Figure{
    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    //override nie jest konieczny, ale sprawdza czy na pewno dobrze nadpisujemy
    double getField() {
        return 0.5*a*h;
    }

    public double getPerimeter() {
        return 10; //na potrzeby zadania zawsze zwroci 10;
    }
}
