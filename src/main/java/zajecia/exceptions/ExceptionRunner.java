package zajecia.exceptions;

import java.io.FileNotFoundException;

public class ExceptionRunner {
    public static void main(String[] args) throws FileNotFoundException {
        //ex1();
        ex2();
    }

    private static void ex1() throws FileNotFoundException {
        ExceptionRunner runner = new ExceptionRunner();
        String exceptions = runner.exceptions();
        System.out.println(exceptions);
    }

    private static void ex2(){

    }

    public String exceptions() throws FileNotFoundException {
        String result = "";
        String v = null;
        try {
            try {
                result += "before";
                v.length();
                result += "after";
            } catch (NullPointerException e) {
                result += "catch";
                throw new RuntimeException();
            } finally {
                result += "finally";
                throw new FileNotFoundException();
            }
        } catch (FileNotFoundException e) {
            result += "done";
        }
        return result;
    }
}
