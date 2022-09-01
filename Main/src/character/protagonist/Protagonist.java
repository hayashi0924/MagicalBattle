package character.protagonist;

import character.type.Type;
import character.hitPoint.HitPoint;
import character.magicPoint.MagicPoint;
import character.name.Name;

public class Protagonist {
    private Name name;
    private HitPoint hitPoint;
    private MagicPoint magicPoint;
    private Type type;

    public Protagonist(Name name, HitPoint hitPoint, MagicPoint magicPoint, Type type){
        this.name = name;
        this.hitPoint = hitPoint;
        this.magicPoint = magicPoint;
        this.type = type;
    }


}
