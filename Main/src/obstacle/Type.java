package obstacle;

public enum Type {
    ROCK("岩"),
    WEED("草"),
    ;

    String type;
    Type(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
