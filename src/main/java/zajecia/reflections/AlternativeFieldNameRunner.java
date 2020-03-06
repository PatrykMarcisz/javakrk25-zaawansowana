package zajecia.reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class AlternativeFieldNameRunner {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        PersonXFormat xFormat = new PersonXFormat("imie", "nazwisko");
        Person person = XFormatParser.parseToPerson(xFormat);
        System.out.println(person.getName());
        System.out.println(person.getSurname());
    }
}

class XFormatParser{

    static Person parseToPerson(PersonXFormat xPerson) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Person person = new Person();
        Field[] personFields = Person.class.getDeclaredFields(); //pobiera prywatne pola, getFields pobiera publiczne
        for(Field field : personFields){
            field.setAccessible(true);
            for(Annotation an : field.getAnnotations()){
                if(an instanceof AlternativeFieldName){
                    String extName = field.getAnnotation(AlternativeFieldName.class).fieldName();
                    field.set(person, PersonXFormat.class.getMethod("get"+extName.substring(0, 1).toUpperCase() + extName.substring(1)).invoke(xPerson));
                }
            }
        }
        return person;
    }
}
