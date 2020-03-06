package zadania.domowe.generics;

public class FiveElements<A,B,C,D,E> {

    Pair<A,B> pair;
    Triple<C,D,E> triple;

    public FiveElements(A first, B second, C third, D fourth, E fifth) {
        this.pair = new Pair<>(first, second);
        this.triple = new Triple<>(third, fourth, fifth);
    }

    public A getFirst(){
        return pair.getFirstValue();
    }

    public E getFifth(){
        return triple.thirdValue;
    }
}
