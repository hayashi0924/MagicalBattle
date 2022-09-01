package character.magicPoint;

public class Decision {
    static final int MIN_VALUE = 20;
    static final int MAX_VALUE = 60;

    public static boolean wasValid(final int value){
        return MIN_VALUE <= value && value <= MAX_VALUE;
    }
}
