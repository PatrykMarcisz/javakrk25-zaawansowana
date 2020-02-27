package zadania.domowe.collections.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class Exercise1$2 {
    public static void main(String[] args) {
        SetElement object1 = new SetElement("pierwszy");
        SetElement object2 = new SetElement("pierwszy");
        SetElement object3 = new SetElement("pierwszy");
        SetElement object4 = new SetElement("pierwszy");
        SetElement object5 = new SetElement("pierwszy");
        SetElement object6 = new SetElement("pierwszy");

        Set<SetElement> elements = new HashSet<>();
        elements.add(object1);
        elements.add(object2);
        elements.add(object3);
        elements.add(object4);
        elements.add(object5);
        elements.add(object6);

        System.out.println(elements.size());
        System.out.println(elements.contains(object2));

        SetElement setElement = elements.stream().findFirst().get();
        System.out.println(object1 == setElement);
        System.out.println(object6 == setElement);
    }

    //jezeli nie bedzie statyczna, bedzie najpierw trzeba stworzyc Exercise1$2
    //jezeli nie bedzie wewnetrzna, bedzie konflikt na poziomie pakietu z klasa SetElement z pliku Exercise1
    static class SetElement {

        private String content;

        public SetElement(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }

        @Override
        public int hashCode() {
            return content != null ? content.hashCode() : 0;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SetElement that = (SetElement) o;

            return content != null ? content.equals(that.content) : that.content == null;
        }
    }

}


