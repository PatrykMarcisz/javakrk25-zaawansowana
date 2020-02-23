package zajecia.enums;

public enum Season {
    WINTER(89),
    SPRING(93),
    SUMMER(93),
    FALL(90);

    private int daysNumber;

    Season(int daysNumber) {
        this.daysNumber = daysNumber;
    }

    public int getDaysNumber() {
        return daysNumber;
    }
}
