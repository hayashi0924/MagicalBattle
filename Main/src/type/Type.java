package type;

import character.Character;

public class Type {
    private final Types type;
    private final Types weakType;
    private final Types strongType;

    private Type(final Types type, final Types weakType, final Types strongType){
        this.type = type;
        this.weakType = weakType;
        this.strongType = strongType;
    }

    public static Type init(final Types type){
        Compatibility typeMeasure = new Compatibility();
        return new Type(type, typeMeasure.weak(type), typeMeasure.strong(type));
    }

    public boolean effective(Character character){
        return this.strongType == character.typeIs().weakType;
    }
    public boolean ineffective(Character character){
        return this.weakType == character.typeIs().strongType;
    }

}
