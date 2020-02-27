package zadania.domowe.enums.ex2;

public enum AbstractExample {

    VALUE1 {
        @Override
        String someMethod() {
            return "impl1";
        }
    },

    VALUE2 {
        String someMethod() {
            return "impl2";
        }
    };

    abstract String someMethod();
}

