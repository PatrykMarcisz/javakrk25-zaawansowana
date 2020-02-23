package zajecia.abstractsinterfaces;

public interface Perimeterable {

    double getPerimeter();

    //public abstract double getPerimeter();

    default void interfaceMethod(){
        System.out.println("metoda interfejsu");
    }

}
