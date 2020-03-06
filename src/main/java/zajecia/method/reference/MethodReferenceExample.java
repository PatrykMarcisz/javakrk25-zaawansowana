package zajecia.method.reference;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReferenceExample {
    public static void main(String[] args) {
        MethodReferenceExample ex = new MethodReferenceExample();
    }

    public void call(){

        Stream.of(1,2,3,4,5)
                .filter(x -> mniejszeNiz3(x))
                .filter(this::mniejszeNiz3)
                .filter(mniejszeNiz3Predicate())
//                .forEach(System.out::print)
                .collect(Collectors.toList());

    }

    private Predicate<? super Integer> mniejszeNiz3Predicate() {
        return a -> a.intValue() < 3;
    }

    private boolean mniejszeNiz3(Integer a) {
        return a.intValue() < 3;
    }
}
