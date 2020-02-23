package zajecia.enums.weekdays;

public enum WeekDay {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    boolean isWeekDay(){
        return !(this.equals(WeekDay.SATURDAY) || this.equals(WeekDay.SUNDAY));
    }

    boolean isHoliday(){
        return !isWeekDay();
    }
}
