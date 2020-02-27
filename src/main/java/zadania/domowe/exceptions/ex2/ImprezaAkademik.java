package zadania.domowe.exceptions.ex2;


import java.util.Random;

public class ImprezaAkademik {

    public void party(int drunkLevel) throws UnexpectedException, HangOverException {

        Random random = new Random();
        int i = random.nextInt(30);

        if(i>0 && i <= 5) {
            throw new UnexpectedException();
        } else if(i > 5 && i<=20){
            return;
        }

        if(drunkLevel > 50){
            throw new MarsMissionException();
        } else if(drunkLevel > 40){
            throw new BurningBabilonException();
        } else if (drunkLevel > 30) {
            throw new LoosedWalletException();
        } else if(drunkLevel > 20){
            throw new LoosedKeyException();
        } else if(drunkLevel > 10){
            throw new HangOverException();
        }
    }
}
