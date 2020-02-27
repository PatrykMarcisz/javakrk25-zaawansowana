package zadania.domowe.exceptions.ex1.v2;

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

    static Month ofNumber(int numberOfMonth) throws UnsupportedMonthException {
        for (Month month : values()) {
            if (numberOfMonth == month.ordinal() +1) {
                return month;
            }
        }
        throw new UnsupportedMonthException(numberOfMonth);
    }
}
