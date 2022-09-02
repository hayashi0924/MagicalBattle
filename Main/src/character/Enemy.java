package character;

import character.hitPoint.HitPoint;
import character.magic.Magic;
import character.magicPoint.MagicPoint;
import character.name.Name;
import character.type.Type;
import coordinate.Coordinate;

public class Enemy {
    private final Name name;
    private final HitPoint hitPoint;
    private final MagicPoint magicPoint;
    private final Type type;
    private final Magic magic;
    private final Coordinate coordinate;

    public Enemy(Name name, HitPoint hitPoint, MagicPoint magicPoint, Type type, Magic magic){
        this.name = name;
        this.hitPoint = hitPoint;
        this.magicPoint = magicPoint;
        this.type = type;
        this.magic = magic;
        this.coordinate = Coordinate.set(10, 15);
    }

    public Type typeIs(){
        return this.type;
    }
}
