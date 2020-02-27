package zadania.domowe.streams.part2;

public class Person {

    private final String name;
    private final String surname;
    private final int age;
    private final float height;

    public Person(String name, String surname, int age, float height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
