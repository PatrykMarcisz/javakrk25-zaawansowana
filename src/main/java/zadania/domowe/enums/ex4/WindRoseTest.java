package zadania.domowe.enums.ex4;

public class WindRoseTest {
    public static void main(String[] args) {
        for(WindRose direction : WindRose.values()){
            System.out.println(direction.getLabel());
        }

        WindRose n = WindRose.valueOf("N");
        System.out.println(n);

        WindRose closestWindDirection = WindRose.closestDirection(23);
        System.out.println("Closest direction: " + closestWindDirection);

        double angle = Point.angleBetweenPoints(new Point(40, -73), new Point(38, -77));
        System.out.println(angle);
        System.out.println(WindRose.closestDirection(angle));
    }
}
