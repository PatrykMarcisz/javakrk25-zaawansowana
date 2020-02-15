package patryk.zadania.ex2;

public class MainClass {
    public static void main(String[] args) {
        Point2D point1 = new Point2D(0,0);
        Point2D point2 = new Point2D(point1);
        Point2D point3 = new Point2D(point2, 3, 0);

        System.out.println(point1.toString());
        System.out.println(point2);
        System.out.println(point3);

        Point3D point3D = new Point3D(0,0,0);
        Point3D point3D2 = new Point3D(point3D, 3);

//        point1.distance(point3D);
        System.out.println(point3D.distance(point3D2));

        System.out.println(point3D);
    }
}
