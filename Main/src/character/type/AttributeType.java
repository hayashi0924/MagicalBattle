package character.type;

public enum AttributeType {
    FIRE("炎"),
    WATTER("水"),
    DIRT("土"),
    ;
    final String attribute;
    AttributeType(final String attribute){
        this.attribute = attribute;
    }

    @Override
    public String toString(){
        return this.attribute;
    }
}
