package zadania.domowe.enums.ex5;

public class TranslatableTest {
    public static void main(String[] args) {
        for(MenuItems item : MenuItems.values()){
            System.out.println(item);
            for(Language lang : Language.values()){
                System.out.println(lang + ": " + item.translate(lang));
            }
            System.out.println();
        }
    }
}
