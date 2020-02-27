package zadania.domowe.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");

        System.out.println(colors);

        colors.remove("Red");

        for(String str : colors){
            System.out.println(str);
        }

        int pinkIndex = colors.indexOf("Pink");
        System.out.println("pink index: " + pinkIndex);

        colors.remove(pinkIndex);

        int size = colors.size();
        System.out.println(size);

        colors.add("Red");
        colors.add("Red");
        colors.add("Red");
        colors.add("Red");
        colors.add("Red");

        size = colors.size();
        System.out.println(size);
        System.out.println(colors);

        String thirdElement = colors.get(3);
        System.out.println(thirdElement);


    }


}
