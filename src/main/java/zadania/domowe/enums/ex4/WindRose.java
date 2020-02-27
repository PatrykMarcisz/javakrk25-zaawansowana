package zadania.domowe.enums.ex4;

public enum WindRose{

    N("North", 0),
    NE("North-East", 45),
    E("East", 90),
    SE("South-East", 135),
    S("South", 180),
    SW("South-West", 225),
    W("West", 270),
    NW("North-West", 315);

    private String label;
    private int degree;

    WindRose(String label, int degree) {
        this.label = label;
        this.degree = degree;
    }

    public String getLabel() {
        return label;
    }

    public int getDegree(){
        return degree;
    }

    public static WindRose closestDirection(double closestDegree){
        WindRose lowerDirection = null;
        WindRose higherDirection = null;

        closestDegree = closestDegree % 360;

        for(int i=0 ; i< values().length; i++){
            WindRose actualDirection = values()[i];
            if(closestDegree >= actualDirection.degree){
                lowerDirection = actualDirection;
                if(i+1 < values().length){
                    higherDirection = values()[i+1];
                } else {
                    higherDirection = N;
                }
            }
        }

        return closestDegree % 45 > 22 ? higherDirection : lowerDirection;
    }

}
