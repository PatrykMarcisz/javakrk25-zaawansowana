package zajecia.optional;

public class OptionalExample {

    public static void main(String[] args) {
        NullableExample example = new NullableExample("abd");
        OptionalExample optionalExample = new OptionalExample(example);
        optionalExample.getOrDefault();
        optionalExample.get();


    }

    NullableExample example;

    public OptionalExample(NullableExample example){
        this.example = example;
    }

    String getOrDefault(){
        return example.getNull().orElse("empty");
    }

    boolean get(){
        if(example.getString().isPresent()){
            return true;
        } else {
            return false;
        }

//        return example.getString().isPresent();
    }
}
