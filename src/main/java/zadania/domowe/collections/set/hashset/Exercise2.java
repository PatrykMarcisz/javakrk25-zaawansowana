package zadania.domowe.collections.set.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Exercise2 {
    public static void main(String[] args) {

        String one = "one";
        String three = "three";
        String otherThree = "three";
        String two = "two";
        String otherOne = "one";
        String janusz = "Janusz";
        String otherTwo = "two";
        String four = "four";
        String oneMoreFour = "four";

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(one);
        hashSet.add(three);
        hashSet.add(otherThree);
        hashSet.add(two);
        hashSet.add(otherOne);
        hashSet.add(janusz);
        hashSet.add(otherTwo);
        hashSet.add(one);
        hashSet.add(four);
        hashSet.add(oneMoreFour);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(one);
        linkedHashSet.add(three);
        linkedHashSet.add(otherThree);
        linkedHashSet.add(two);
        linkedHashSet.add(otherOne);
        linkedHashSet.add(janusz);
        linkedHashSet.add(otherTwo);
        linkedHashSet.add(one);
        linkedHashSet.add(four);
        linkedHashSet.add(oneMoreFour);

        System.out.println(hashSet);
        System.out.println(linkedHashSet);


    }
}
