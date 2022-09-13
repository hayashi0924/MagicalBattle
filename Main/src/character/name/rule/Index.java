package character.name.rule;

public enum Index {
    LENGTH(new WordLengthRule()),
    TYPE(new WordTypeRule()),
    ;
    private NamingRule rule;
    Index(NamingRule rule){
        this.rule = rule;
    }
    NamingRule rule(){
        return this.rule;
    }
}
