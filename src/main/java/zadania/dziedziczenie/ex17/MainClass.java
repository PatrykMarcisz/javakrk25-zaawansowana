package zadania.dziedziczenie.ex17;

class M
{
    int i; //27

    public M(int i){ //27
        this.i = i--;  //this.i = 27; i = i-1;
    }
}

class N extends M
{
    public N(int i) { //26
        super(++i);  //super(i); i = i + 1;

        System.out.println(i);
    }
}

public class MainClass
{
    public static void main(String[] args)
    {
        N n = new N(26);
        System.out.println(n.i);
    }
}