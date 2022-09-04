package type;

public enum Types {
    FIRE("炎"),
    WATTER("水"),
    DIRT("土"),
    ;
    final String attribute;
    Types(final String attribute){
        this.attribute = attribute;
    }

    @Override
    public String toString(){
        return this.attribute;
    }
}
