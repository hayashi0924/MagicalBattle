package character.type;

import character.Hero;

public class Type {
    private final Types type;
    private final Types weakType;
    private final Types strongType;

    private Type(final Types type, final Types weakType, final Types strongType){
        this.type = type;
        this.weakType = weakType;
        this.strongType = strongType;
    }

    public static Type set(final Types type){
        Compatibility typeMeasure = new Compatibility();
        return new Type(type, typeMeasure.weak(type), typeMeasure.strong(type));
    }

    private boolean valid(Hero hero){
        return this.strongType == hero.typeIs().weakType;
    }
    private boolean inValid(Hero hero){
        return this.weakType == hero.typeIs().strongType;
    }

}
