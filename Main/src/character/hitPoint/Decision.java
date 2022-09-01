package character.hitPoint;

public class Decision {
    static final int MIN_VALUE = 100;
    static final int MAX_VALUE = 1000;

    static boolean wasValid(final int value){
        return MIN_VALUE <= value && value <= MAX_VALUE;
    }
}
