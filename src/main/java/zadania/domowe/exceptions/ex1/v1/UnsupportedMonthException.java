package zadania.domowe.exceptions.ex1.v1;

public class UnsupportedMonthException extends RuntimeException{
    private final int invalidMonth;

    public UnsupportedMonthException(int invalidMonth) {
        super("Error occured while parsing " + invalidMonth + " to Month");
        this.invalidMonth = invalidMonth;
    }

    public int getInvalidMonth() {
        return invalidMonth;
    }
}
