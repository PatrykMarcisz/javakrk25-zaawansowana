package zajecia.streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SimpleStreamsRunner {
    public static void main(String[] args) {
        ex5();
    }

    static void ex1(){
        Stream<String> first = Stream.of("first", "second", "third", "fourth", "fifth");
        //dluzsze niz 5 znakow
        Stream<String> step2 = first.filter(x -> x.length() > 5);
        //wszystkie do uppercase
        Stream<String> step3 = step2.map(x -> x.toUpperCase());
        //zwracamy jako lista
        List<String> result = step3.collect(Collectors.toList());

        for(String s : result){
            System.out.println(s);
        }

        List<String> result2 = Stream.of("first", "second", "third", "fourth", "fifth")
                .filter(greaterThan5Sign())
                .map(x -> x.toUpperCase())
                .collect(Collectors.toList());
    }

    private static Predicate<String> greaterThan5Sign() {
        return x -> x.length() > 5;
    }

    static void ex1_alternative(){
        //z utworzonego strumienia zwróć słowa dłuższe niż 5 znaków oraz zwróć je w
        //formacie UPPERCASE

        List<String> stringList = new ArrayList<>();
        stringList.add("first");
        stringList.add("second");
        stringList.add("third");
        stringList.add("fourth");
        stringList.add("fifth");

        List<String> afterFilter = new ArrayList<>();
        for(String str : stringList){
            //taki filter
            if(str.length() > 5){
                afterFilter.add(str.toUpperCase()); //map
            }
        }
        afterFilter.forEach(element -> System.out.println(element));





    }

    static void ex2(){
        Optional<String> any = Stream.of("first", "second", "third", "fourth", "fifth", "twenty-one")
                .filter(x -> x.length() > 7)
                .findAny();

        if(any.isPresent()){
            String s = any.get();
            System.out.println(s);
        }

        String result = any.orElse("to zwracamy jesli tam bylo pusto");

    }

    static void ex2_alternative(){
        List<String> stringList = new ArrayList<>();
        stringList.add("first");
        stringList.add("second");
        stringList.add("third");
        stringList.add("fourth");
        stringList.add("fifth");
//        stringList = new ArrayList<>(Arrays.asList("first", "second", "third", "fourth", "fifth"))

        String result = null;
        for(int i=0; i<stringList.size(); i++){
            if(stringList.get(i).length() > 5){
                result = stringList.get(i);
                break;
            }
        }
        System.out.println(result);
    }

    static void ex4(){
        Stream.of(1,2,3,4).mapToInt(x -> x).max();
        //lub
        OptionalInt max = IntStream.of(1, 26, 30, 2, 45).max();

        if(max.isPresent()) {
            int asInt = max.getAsInt();
            System.out.println(asInt);
        }
    }

    static void ex5(){
        List<String> collect = Stream.of(1, 26, 30, 2, 45)
                .filter(x -> x > 26)
                .map(x -> Integer.toString(x))
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

    }

}
