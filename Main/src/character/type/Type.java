package character.type;

public class Type {
    private final AttributeType type;
    private final AttributeType weakType;
    private final AttributeType strongType;

    private Type(final AttributeType type, final AttributeType weakType, final AttributeType strongType){
        this.type = type;
        this.weakType = weakType;
        this.strongType = strongType;
    }

    public static Type set(final AttributeType type){
        Compatibility typeMeasure = new Compatibility();
        return new Type(type, typeMeasure.weak(type), typeMeasure.strong(type));
    }

}
