package patryk.zadania;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesRunner {
    public static void main(String[] args) {
        testPredicate("test", (t) -> t.length() > 5);
        testPredicate("test", (t) -> {
            for (char c : t.toCharArray()) {
                if (Character.isLetter(c)) {
                    return false;
                }
            }
            return true;
        });

        Function<String, String> toUpperCase = str -> str.toUpperCase();
        Function<String, String> reverseString = str -> new StringBuilder(str).reverse().toString();

        String input = "testOwy String";
        Function<String, String> stringStringFunction = toUpperCase.andThen(reverseString);

        toUpperCase.andThen(reverseString).apply(input);

        Person person = new Person();
        person.setAge(18);
        person.setName("name");
        test(person);

        test(((Supplier<Person>) () -> {
            Person pers = new Person();
            pers.setAge(18);
            pers.setName("name");
            return pers;
        }).get());

    }

    private static void test(Person p) {
        //..
    }

    private static void testPredicate(String t, Predicate<String> predicate) {
        boolean test = predicate.test(t);
    }

    static class Person {
        int age;
        String name;
        String surname;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }
    }

}
