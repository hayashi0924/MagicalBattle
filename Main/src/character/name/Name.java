package character.name;

public class Name {
    private final String name;

    private Name(final String name){
        this.name = name;
    }

    public static Name init(final String name){
        Decision nameCheck = new Decision();
        nameCheck.add(new WordLengthRule());
        nameCheck.add(new WordTypeRule());
        if(!nameCheck.isValid(name)){
            throw new IllegalArgumentException("名前は１文字以上、５文字以内で入力してください");
        }
        return new Name(name);
    }
}
