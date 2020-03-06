package zadania.domowe.generics;

public class FiveElements<A,B,C,D,E> {

    public Pair<A,B> pair;
    public Triple<C,D,E> triple;

    public FiveElements(A first, B second, C third, D fourth, E fifth) {
        this.pair = new Pair<>(first, second);
        this.triple = new Triple<>(third, fourth, fifth);
    }

    public static void main(String[] args) {
        FiveElements fiveElements = new FiveElements(1,2,3,4,5);
    }

    public A getFirst(){
        return pair.getFirstValue();
    }

    public E getFifth(){
        return triple.thirdValue;
    }
}
