package zadania.ex12;

public class MainClass {
    public static void main(String[] args) {
        Vehicle a = new Vehicle();
        Vehicle b = new Vehicle(500);
        Vehicle c = new Vehicle(3, "green");
        Vehicle d = new Vehicle(4, "magenta", 250.0);

        Vehicle[] vehicles = { a, b, c, d};
        for(Vehicle v : vehicles){
            System.out.println(v.color);
            System.out.println(v.maxSpeed);
            System.out.println(v.wheelsCounter);
            System.out.println("--------------");
        }
    }
}

class Vehicle {

    int wheelsCounter;
    String color;
    double maxSpeed;

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheelsCounter=" + wheelsCounter +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public Vehicle(){
        this(4, "red", 250.0);
    }

    public Vehicle(double maxSpeed){
        this(4, "red", maxSpeed);
    }

    public Vehicle(int wheelsCounter, String color){
        this(wheelsCounter, color, 250.0);
    }

    public Vehicle(int wheelsCounter, String color, double maxSpeed){
        super();
        this.wheelsCounter = wheelsCounter;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
