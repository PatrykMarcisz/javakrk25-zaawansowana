package zajecia.abstractsinterfaces;

public class ShopItemRunner {
    public static void main(String[] args) {
        ShopItem item = new ShopItem();
        item.price = 50;

        System.out.println(item.salePrice());
        System.out.println(item.salePriceV2());
        System.out.println(item.salePriceV3());

        System.out.println();
    }
}
