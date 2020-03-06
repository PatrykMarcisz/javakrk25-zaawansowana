package zajecia.reflections;

public class Person {

    @AlternativeFieldName(fieldName = "person_name")
    private String name;

    @AlternativeFieldName(fieldName = "person_surname")
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
