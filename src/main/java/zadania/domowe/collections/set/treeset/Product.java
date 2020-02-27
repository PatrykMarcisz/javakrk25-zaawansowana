package zadania.domowe.collections.set.treeset;

import java.util.Comparator;

public class Product implements Comparable<Product>{
    private final String name;
    private final int price;
    private final Category category;

    public Product(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public int compareTo(Product otherProduct) {
        return Comparator.comparing(Product::getName)
                .thenComparing(Product::getCategory)
                .thenComparing(Product::getPrice)
                .compare(this, otherProduct);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}

