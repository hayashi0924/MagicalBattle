package character.name;

import character.name.rule.Decision;

public class Name {
    private final String name;

    private Name(final String name){
        this.name = name;
    }

    public static Name init(final String name){
        if(!Decision.isValid(name)){
            throw new IllegalArgumentException("名前は１文字以上、５文字以内で入力してください");
        }
        return new Name(name);
    }
}
