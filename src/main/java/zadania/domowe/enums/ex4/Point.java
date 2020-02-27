package zadania.domowe.enums.ex4;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //nie jestem tego 100% pewny, musze jeszcze przeanalizowac teorie matematyczna ;)
    public static double angleBetweenPoints(Point a, Point b) {

        double difX = b.x - a.x;
        double difY = b.y - a.y;
        double rotAng = Math.toDegrees(Math.atan2(difY, difX));
        while(rotAng < 0) {
            rotAng += 360;
        }

        return rotAng;
    }

}
