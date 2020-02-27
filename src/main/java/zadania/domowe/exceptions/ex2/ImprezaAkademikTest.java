package zadania.domowe.exceptions.ex2;

public class ImprezaAkademikTest {
    public static void main(String[] args) {
        for(int i=1; i < 60; i+=2){
            try {
                new ImprezaAkademik().party(i);
                System.out.println("Fajna impreza, nie stało się nic złego");
            } catch (UnexpectedException e) {
                System.out.println("Wydarzyło się coś nieoczekiwanego, nie miałeś na to wpływu");
            } catch (LoosedKeyException | LoosedWalletException e){
                System.out.println("Straciłeś jedną z ważnych rzeczy, poszukaj a jeśli nie znajdziesz zgłoś na policję zagubienie");
            } catch(MarsMissionException e){
                System.out.println("Chciałeś ruszyć z misją ratunkową za kolegami którzy wystartowali na marsa. To cud że jeszcze żyjesz!");
            } catch (BurningBabilonException e){
                System.out.println("Gratulacje, teraz cały Kraków o was mówi, drogo zapłacisz za swoją głupotę");
            } catch (HangOverException e) {
                System.out.println("Los był dla ciebie łaskawy, skończyło się tylko kacem");
            }
        }
    }
}
