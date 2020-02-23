package zajecia.exceptions;

class CannotSwimException extends Exception {}
class DangerInTheWater extends RuntimeException {}
class SharkInTheWaterException {}

class Human {
    boolean canSwim;

    public Human(){
        int result = (int)Math.random()*100;
    }

    public void swim() throws CannotSwimException {
        // nieumiejetnosc plywania w trakcie kiedy próbujemy pływac
        // moze byc niebezpieczną sytuacją wartą obsłużenia,
        // np potrzeba zawołania ratownika (͡•ʖ͡•)
    }
}