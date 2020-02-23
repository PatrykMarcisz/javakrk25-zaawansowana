package zajecia.optional;

import java.util.Optional;

public class NullableExample {

    private final String string;

    public NullableExample(String string) {
        this.string = string;
    }

    Optional<String> getNull(){
        return Optional.ofNullable(null);
    }

    Optional<String> getString(){
        return Optional.of(string).filter(s -> s.length() > 5);
    }
}
