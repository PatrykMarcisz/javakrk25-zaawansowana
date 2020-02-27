package zadania.domowe.enums.ex3;

public enum OrderInEnum {
    ELEMENT1,
    ELEMENT2,
    ELEMENT3,
    ELEMENT4;

    public static void main(String[] args) {
        for(OrderInEnum el : OrderInEnum.values()){
            System.out.println(el + " " + el.ordinal());
        }
    }
}
