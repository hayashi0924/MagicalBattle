package character.attackPoint;

class Decision {
    static final int MIN_VALUE = 5;
    static final int MAX_VALUE = 30;

    public static boolean isValid(final int value){
        return MIN_VALUE <= value && value <= MAX_VALUE;
    }
}
