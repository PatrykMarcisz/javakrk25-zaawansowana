package zadania.domowe.generics;

public class Triple<A,B,C> {
    A firstValue;
    B secondValue;
    C thirdValue;

    public Triple(A firstValue, B secondValue, C thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }
}
