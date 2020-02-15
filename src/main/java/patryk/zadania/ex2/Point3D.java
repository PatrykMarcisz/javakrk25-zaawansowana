package patryk.zadania.ex2;

public class Point3D extends Point2D {

    private double z;

    public Point3D(double x, double y, double z){
        super(x,y);
        this.z = z;
    }

    public Point3D(Point3D point3d){
        super(point3d.x, point3d.getY());
        this.z = point3d.z;
    }

    public Point3D(Point2D point2, double z){
        super(point2.getX(), point2.getY());
        this.z = z;
    }



}
