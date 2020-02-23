package zajecia.optional;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.lang.Math.pow;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number%2 == 0;
        Predicate<Integer> odd = number -> number%2 == 1;

        int x = 20;
        System.out.println(doPredicate(isEven, x));
        System.out.println(doPredicate(odd, x));

        boolean test = isEven.test(20);
        boolean test2 = isEven.test(21);
        System.out.println(test);
        System.out.println(test2);
//
//        x -> x+10;
//        x -> { return x + 10; };
//        (int x) -> x + 10;
//        (x,y) -> ;
//        (double x, double y) ->

        Function<Integer, Integer> multiplier = input -> {
            System.out.println("DSADASD");
            System.out.println("DSADASD");
            System.out.println("DSADASD");
            System.out.println("DSADASD");
            return (int)pow(input,input);
        };
        System.out.println(multiplier.apply(2));

        Optional<String> stringOpt = Optional.of("ABCD");

        if(stringOpt.isPresent()){
            String s = stringOpt.get();
            System.out.println(s);
        }

        stringOpt.ifPresent(str -> System.out.println(str));

    }

    public static boolean doPredicate(Predicate<Integer> predicate, int x){
        return predicate.test(x);
    }
}
