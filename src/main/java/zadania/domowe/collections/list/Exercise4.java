package zadania.domowe.collections.list;


import zadania.domowe.enums.ex1.WeekDay;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        List<WeekDay> days = Arrays.asList(WeekDay.values());
        ArrayList<WeekDay> daysList = new ArrayList<>(days);
        System.out.println(daysList);
        Collections.sort(daysList, new WeekDayComparator());
        System.out.println(daysList);
        daysList.sort((x, y) -> y.toString().compareTo(x.toString())); //sortowanie w odwrotnym porzadku
        System.out.println(daysList);
        daysList.clear();
        System.out.println(daysList);
    }
}

class WeekDayComparator implements Comparator<WeekDay> {

    @Override
    public int compare(WeekDay o1, WeekDay o2) {
        return o1.toString().compareTo(o2.toString());
    }
}

