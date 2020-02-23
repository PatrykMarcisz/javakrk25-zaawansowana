package zajecia.abstractsinterfaces;

public class OtoczkaStatycznej {

    private int x;
    private int xx;

    public OtoczkaStatycznej(int x, int xx) {
        this.x = x;
        this.xx = xx;
    }

    public int getX() {
        return x;
    }

    public int getStaticInt(Statyczna statyczna){
        return statyczna.x;
    }

    public int getXx() {
        return xx;
    }

    public static class Statyczna {
        private int x;

        public Statyczna(int x) {
            this.x = x;
        }

        public int getOtoczkaStatycznaInt(OtoczkaStatycznej os){
            return os.x;
        }

        public int getX() {
            return x;
        }
    }

}
