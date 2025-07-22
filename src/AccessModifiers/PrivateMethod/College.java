package AccessModifiers.PrivateMethod;

public class College {
    private static College instance;

    private College() {
    }

    public static College getInstance() {
        if (instance == null){
            instance = new College();
    }
    return instance;
}
}
