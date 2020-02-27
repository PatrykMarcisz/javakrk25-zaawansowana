package zadania.domowe.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
    public static void main(String[] args) {
        Map<Character, Integer> count = count("Ala ma kota, a kot ma Alę", false);
        Map<Character, Integer> countIgnoreCase = count("Ala ma kota, a kot ma Alę", true);

        printMap(count);
        System.out.println("--------");
        printMap(countIgnoreCase);


    }

    private static void printMap(Map<Character, Integer> count) {
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static Map<Character, Integer> count(String input, boolean ignoreLetterSize) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character character : input.toCharArray()) {
            int count = 0;
            Character currentChar = ignoreLetterSize
                    ? Character.toUpperCase(character)
                    : character;

            if (map.containsKey(currentChar)) {
                count = map.get(currentChar);
            }
            count = count + 1;
            map.put(currentChar, count);
        }
        return map;

    }
}
