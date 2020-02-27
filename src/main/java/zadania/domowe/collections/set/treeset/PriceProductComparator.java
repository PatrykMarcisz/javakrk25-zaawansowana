package zadania.domowe.collections.set.treeset;

import java.util.Comparator;

public class PriceProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Comparator.comparing(Product::getPrice)
                .thenComparing(Product::getName)
                .thenComparing(Product::getCategory)
                .compare(o1, o2);
    }
}
