package zajecia.enums.weekdays;

public class WeekDayDemo {
    public static void main(String[] args) {

        for(WeekDay day : WeekDay.values()){
            System.out.println(day + " : " + testDay(day));
        }

        System.out.println("--------------");

        for(WeekDay day : WeekDay.values()){
            System.out.println(day + " comparing with " + WeekDay.SATURDAY + " : " + isGreaterThanSaturday(day));
        }

    }

    private static String testDay(WeekDay weekDay) {
        if(weekDay.isWeekDay()){
            return "Go to work";
        } else {
            return "Today time for rest";
        }
    }

    private static boolean isGreaterThanSaturday(WeekDay day){
        int compareResult = day.compareTo(WeekDay.SATURDAY);
        return compareResult >= 0;
    }
}
