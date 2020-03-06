package zajecia.reflections;

public class PersonXFormat {

    private String person_name;
    private String person_surname;

    public PersonXFormat(String person_name, String person_surname) {
        this.person_name = person_name;
        this.person_surname = person_surname;
    }

    public String getPerson_name() {
        return person_name;
    }

    public String getPerson_surname() {
        return person_surname;
    }
}
