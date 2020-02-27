package zadania.domowe.exceptions.ex1.v2;

public class UnsupportedMonthException extends Exception{

    private final int invalidMonth;

    public UnsupportedMonthException(int invalidMonth) {
        super("Error occured while parsing " + invalidMonth + " to Month");
        this.invalidMonth = invalidMonth;
    }

    public int getInvalidMonth() {
        return invalidMonth;
    }
}
