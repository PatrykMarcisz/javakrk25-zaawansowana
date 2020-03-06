package zajecia.abstractsinterfaces;

import java.util.Objects;
import java.util.function.Function;

public class ShopItem {

    double price;

    @FunctionalInterface
    interface Discount {
        double discountInDollars(double basePrice);
    }

    double salePrice() {
        class DiscountLocal implements Discount {
            @Override
            public double discountInDollars(double basePrice) {
                return basePrice - basePrice * 0.03;
            }
        }

        Discount discountLocal = new DiscountLocal();
        return discountLocal.discountInDollars(price);
    }

    double salePriceV2() {
        Discount discount = new Discount() {
            @Override
            public double discountInDollars(double basePrice) {
                double priceAfterDiscount;
                if (basePrice - 5 > 0) {
                    priceAfterDiscount = basePrice - 5;
                } else {
                    priceAfterDiscount = basePrice;
                }
//                return priceAfterDiscount;

                //(warunek logiczny) ? <wynik jesli prawda> : <wynik jesli falsz>
                return (basePrice - 5 > 0)
                        ? basePrice - 5
                        : basePrice;
            }
        };
        return discount.discountInDollars(price);
    }

    double salePriceV3() {
        Discount discount = basePrice -> basePrice - 5 > 0 ? basePrice - 5 : basePrice;

        Discount discount2 = (double basePrice) -> {
            if (basePrice - 5 > 0) {
                return basePrice - 5;
            } else {
                return  basePrice;
            }
        };

        Function<Double, Double> discountFuntion = basePrice -> basePrice - 5 > 0 ? basePrice - 5 : basePrice;
        discountFuntion.apply(price);

        return discount.discountInDollars(price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopItem shopItem = (ShopItem) o;
        return Double.compare(shopItem.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }
}
