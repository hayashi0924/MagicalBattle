package character.name.rule;

class WordTypeRule implements NamingRule{


    @Override
    public boolean isValid(String name) {
        return name.matches("^[あ-んア-ンー-龠]");
    }
}
