package zadania.domowe.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("String");
        list.add(5);
        list.add(new Email("user@user.com"));

        System.out.println(list);

        Object firstElement = list.get(0);
        int length = ((String) firstElement).length();
        System.out.println(length);

        if(firstElement instanceof String){
            String str = (String)firstElement;
            System.out.println(str.length());
        }

        if(firstElement.getClass().getSimpleName().equals("String")){
            //getSimpleName() --> String
            //getName() --> java.lang.String
            String str = (String)firstElement;
            System.out.println(str.length());
        }

        if(firstElement.getClass().equals(String.class)){
            //getSimpleName() --> String
            //getName() --> java.lang.String
            String str = (String)firstElement;
            System.out.println(str.length());
        }


    }
}
