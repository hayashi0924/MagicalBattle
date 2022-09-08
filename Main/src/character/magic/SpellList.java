package character.magic;

public enum SpellList {
    WEAK_FIRE("弱い炎"),
    WEAK_DIRT("弱い土"),
    WEAK_WATER("弱い水"),
    FIRE("炎"),
    DIRT("土"),
    WATER("水"),
    ;
    private final String name;
    SpellList(final String name){
        this.name = name;
    };

    public String toString(){
        return this.name;
    }

}
