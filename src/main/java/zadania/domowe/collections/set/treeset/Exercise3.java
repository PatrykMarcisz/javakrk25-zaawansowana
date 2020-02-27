package zadania.domowe.collections.set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class Exercise3 {
    public static void main(String[] args) {
        Product comic = new Product("Tytus Romek i Atomek", 20, Category.BOOK);
        Product laptop = new Product("Lenovo Legion", 3000, Category.ELECTRONICS);
        Product laptop2 = new Product("Asus Zenbook", 400, Category.ELECTRONICS);
        Product album = new Product("AC/DC", 20, Category.MUSIC);

        //default sorting by class
        Set<Product> productSet = new TreeSet<>();
        productSet.add(comic);
        productSet.add(laptop);
        productSet.add(laptop2);
        productSet.add(album);

        productSet.forEach(System.out::println);

        System.out.println("------------------");

        //custom sorting by comparator
        Set<Product> productSetByComparator = new TreeSet<>(new PriceProductComparator());
        productSetByComparator.add(comic);
        productSetByComparator.add(laptop);
        productSetByComparator.add(laptop2);
        productSetByComparator.add(album);

        productSetByComparator.forEach(System.out::println);

        //sprawdzenie czy metoda contains wymaga nadpisania equals/hashcode
        System.out.println(productSet.contains(album));
        System.out.println(productSet.contains(new Product("AC/DC", 20, Category.MUSIC)));

        //first/last
        System.out.println(((TreeSet)productSet).first());
        System.out.println(((TreeSet)productSet).last());

    }




}
