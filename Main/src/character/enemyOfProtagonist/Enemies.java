package character.enemyOfProtagonist;

import character.type.Type;
import character.hitPoint.HitPoint;
import character.magicPoint.MagicPoint;
import character.name.Name;

public class Enemies {
    private Name name;
    private HitPoint hitPoint;
    private MagicPoint magicPoint;

    private Type type;

    public Enemies(Name name, HitPoint hitPoint, MagicPoint magicPoint, Type type){
        this.name = name;
        this.hitPoint = hitPoint;
        this.magicPoint = magicPoint;
        this.type = type;
    }
}
