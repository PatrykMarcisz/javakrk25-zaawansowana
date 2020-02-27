package zadania.domowe.collections.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class Exercise1 {
    public static void main(String[] args) {
        SetElement object1 = new SetElement("pierwszy");
        SetElement object2 = new SetElement("pierwszy");
        SetElement object3 = new SetElement("pierwszy");
        SetElement object4 = new SetElement("pierwszy");
        SetElement object5 = new SetElement("pierwszy");
        SetElement object6 = new SetElement("pierwszy");

        Set<SetElement> set = new HashSet<>();
        set.add(object1);
        set.add(object2);
        set.add(object3);
        set.add(object4);
        set.add(object5);
        set.add(object6);

        System.out.println(set.size());
        System.out.println(set.contains(object2));
    }

    static class SetElement {

        private String content;

        public SetElement(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }
    }
}



