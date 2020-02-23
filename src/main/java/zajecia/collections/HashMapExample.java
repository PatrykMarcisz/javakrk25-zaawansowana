package zajecia.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Character> lettersInWord = new HashMap<>();
        lettersInWord.put("A", 'A');
        lettersInWord.put("C", 'C');

        lettersInWord.get("A");

        lettersInWord.containsKey("A");
        lettersInWord.containsValue('A');

        for(Map.Entry<String, Character> entry : lettersInWord.entrySet()){
            String key = entry.getKey();
            Character value = entry.getValue();
        }

        for(String key : lettersInWord.keySet()){

        }

        for(Character c : lettersInWord.values()){

        }
    }
}
