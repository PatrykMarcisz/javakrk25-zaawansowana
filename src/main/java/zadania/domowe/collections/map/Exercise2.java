package zadania.domowe.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {
    public static void main(String[] args) {
        Map<Key, String> map = new HashMap<>();
        Key firstKey = new Key("first");
        map.put(firstKey, "pierwszaWartosc");

        firstKey.setKey("first2");

        System.out.println(map.get(firstKey));
        System.out.println(map.get(new Key("first")));
    }

}
