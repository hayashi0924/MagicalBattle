package field.obstacle;

public enum Type {
    ROCK("岩"),
    WEED("草"),
    ;

    String type;
    Type(String type){
        this.type = type;
    }
    public String getName(){
        return this.type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
