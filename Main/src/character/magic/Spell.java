package character.magic;

import character.attackPoint.AttackPoint;
import type.Type;

public class Spell {
    private final AttackPoint attackPoint;
    private final Type type;

    Spell(AttackPoint attackPoint, Type type){
        this.attackPoint = attackPoint;
        this.type = type;
    }

    public AttackPoint getMagicPoint(){
        return this.attackPoint;
    }
    public Type getType(){
        return this.type;
    }
}
