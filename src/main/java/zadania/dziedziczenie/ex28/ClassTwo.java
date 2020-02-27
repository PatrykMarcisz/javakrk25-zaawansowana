package zadania.dziedziczenie.ex28;
class ClassOne {
    static int i, j = 191919;

    {
        --i;
    }

    {
        j++;
    }
}

public class ClassTwo extends ClassOne {
    static {
        i++;
    }

    static {
        --j;
    }

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(j);

        int a = 5;
        int b = 3;
        int c = a * b++;   // c is set to 15
        System.out.println(b);
        System.out.println(c);
        int d = a * ++b;   // d is set to 25
        System.out.println(d);
        System.out.println(b);
    }
}