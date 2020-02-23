package zajecia.exceptions;

import java.util.Random;

class CannotSwimException extends Exception {}
class DangerInTheWater extends RuntimeException {}
class SharkInTheWaterException extends DangerInTheWater {}
class HumanCannotSwimException extends CannotSwimException {
    private Human human;

    public void sendToSwimSchool(){
        human.kursPlywania();
    }

    public HumanCannotSwimException(Human human){
        this.human = human;
    }
}

class Human {
    boolean canSwim;
    int number;
    static int commonNumber;

    public Human(){
        int result = (int) (Math.random() * 100);
        canSwim = result%2==0;
        number = ++commonNumber;
    }

    public void kursPlywania(){
        System.out.println("udaje sie na kurs plywania");
    }

    public void swim() throws CannotSwimException {
        if(!canSwim){
            throw new HumanCannotSwimException(this);
        }
        System.out.println("patrz, plynie!");
        Random random = new Random();
        int event = random.nextInt(30);
        if(event > 20){
            System.out.println("Rekin atakuje!");
            throw new SharkInTheWaterException();
        } else if(event > 10){
            System.out.println("coś jest pod powierzchnia wody!");
        } else {
            System.out.println("nic sie nie dzieje");
        }
        // nieumiejetnosc plywania w trakcie kiedy próbujemy pływac
        // moze byc niebezpieczną sytuacją wartą obsłużenia,
        // np potrzeba zawołania ratownika (͡•ʖ͡•)
    }
}