package zajecia.streams;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStreamsRunner {
    public static void main(String[] args) {
        ex1();
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
                .filter(x -> x.length() > 5)
                .map(x -> x.toUpperCase())
                .collect(Collectors.toList());
    }

    static void ex2(){
        Optional<String> any = Stream.of("first", "second", "third", "fourth", "fifth")
                .filter(x -> x.length() > 7)
                .findAny();

        if(any.isPresent()){
            String s = any.get();
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

}
