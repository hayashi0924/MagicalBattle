package type;

import character.Character;
import type.compatibility.Compatibility;

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

    public Types getWeakType(){
        return this.weakType;
    }
    public Types getStrongType(){
        return this.strongType;
    }

}
