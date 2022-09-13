package character.name.rule;

class WordLengthRule implements NamingRule {
    static final int MIN_LENGTH = 1;
    static final int MAX_LENGTH = 5;

    @Override
    public boolean isValid(String name) {
        return MIN_LENGTH <= name.length() && name.length() <= MAX_LENGTH;
    }
}
