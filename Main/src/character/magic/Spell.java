package character.magic;

import character.magicPoint.MagicPoint;
import type.Type;

public class Spell {
    private final MagicPoint magicPoint;
    private final Type type;

    Spell(MagicPoint magicPoint, Type type){
        this.magicPoint = magicPoint;
        this.type = type;
    }

    public MagicPoint getMagicPoint(){
        return this.magicPoint;
    }
    public Type getType(){
        return this.type;
    }
}
