package zadania.domowe.exceptions.ex1.v1;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    static Month ofNumber(int numberOfMonth) {
        for (Month month : values()) {
            if (numberOfMonth == month.ordinal() +1) {
                return month;
            }
        }
        throw new UnsupportedMonthException(numberOfMonth);
    }

    public static boolean isMonthNumberSupported(int i) {
        return i > 0 && i < values().length;
    }
}
