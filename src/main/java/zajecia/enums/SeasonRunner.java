package zajecia.enums;

public class SeasonRunner {

    public static void main(String[] args) {
        Season poraRoku = Season.WINTER;
        if (poraRoku == Season.SUMMER) {
            System.out.println("latooo");
        } else if (poraRoku.equals(Season.WINTER)) {
            System.out.println("winter is comming");
        }

        switch (poraRoku) {
            case SPRING:
                System.out.println("wiosna");
                break;
            case SUMMER:
                System.out.println("lato");
                break;
            case FALL:
                System.out.println("jesien");
                break;
            case WINTER: {
                System.out.println("winter is comming");
                break;
            }
        }

        String name = poraRoku.name();
        System.out.println(name);
        System.out.println(poraRoku);

        Season season = Season.valueOf("WINTER");
        System.out.println(season);
        System.out.println(Double.valueOf("4"));

        Season[] values = Season.values();
        for (Season currentSeason : values) {
            System.out.println(
                    currentSeason.name() +
                            " " + currentSeason.ordinal() +
                            " " + "ilosc dni w roku " + currentSeason.getDaysNumber()
            );
        }

    }

}
