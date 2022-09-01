package character.name;

public class Name {
    final String name;

    private Name(final String name){
        this.name = name;
    }

    public static Name set(final String name){
        Decision check = new Decision();
        check.add(new WordLengthRule());
        check.add(new WordTypeRule());
        if(!check.wasValid(name)){
            throw new IllegalArgumentException("名前は１文字以上、５文字以内で入力してください");
        }
        return new Name(name);
    }
}
