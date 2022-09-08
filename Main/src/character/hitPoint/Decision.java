package character.hitPoint;
class Decision {
    static final int SET_MIN_VALUE = 100;
    static final int SET_MAX_VALUE = 1000;

    static final int MIN_VALUE = 0;
    static final int MAX_VALUE = 1200;

    static boolean setValueWasValid(final int value){
        return SET_MIN_VALUE <= value && value <= SET_MAX_VALUE;
    }
    static boolean afterHitPointWasValid(final int value){
        return MIN_VALUE <= value && value <= MAX_VALUE;
    }
}
