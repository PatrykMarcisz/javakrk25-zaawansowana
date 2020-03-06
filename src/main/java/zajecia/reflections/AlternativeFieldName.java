package zajecia.reflections;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ElementType.FIELD})
@Retention(RUNTIME) //adnotacje będą wykrywane w czasie wykonywania programu.
public @interface AlternativeFieldName {

    String fieldName();

}

