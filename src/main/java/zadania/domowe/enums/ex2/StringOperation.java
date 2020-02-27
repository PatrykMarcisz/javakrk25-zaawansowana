package zadania.domowe.enums.ex2;

public enum StringOperation {

    REVERSE {
        public String of(String origin) {
            return new StringBuilder(origin).reverse().toString();
        }
    },

    TO_LOWER {
        public String of(String origin) {
            return origin.toLowerCase();
        }
    },

    TO_UPPER {
        public String of(String origin) {
            return origin.toUpperCase();
        }
    },

    UPPER_FIRST {
        public String of(String origin) {
            return Character.toUpperCase(origin.charAt(0)) +
                    origin.toLowerCase().substring(1, origin.length());
        }
    };

    public abstract String of(String origin);
}
