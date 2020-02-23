package zajecia.collections;

import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
    public static void main(String[] args) {
        String input = "Ala ma kota a kot ma Alę";
        Map<Character, Integer> map = count(input, true);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("-----------");

        map = count(input, false);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static Map<Character, Integer> count(String input, boolean ignoreLetterSize) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            if(ignoreLetterSize) {
                c = String.valueOf(c).toUpperCase().charAt(0);
            }
            if (map.containsKey(c)) {
                Integer value = map.get(c);
                value = value + 1;
                map.put(c, value);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
}
