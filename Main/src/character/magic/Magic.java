package character.magic;

import character.attackPoint.AttackPoint;
import character.type.Type;
import character.type.Types;

public enum Magic {
    WEAK_FIRE("弱い炎", Type.init(Types.FIRE), AttackPointOfSpell.WEAK_FIRE),
    WEAK_DIRT("弱い土", Type.init(Types.DIRT), AttackPointOfSpell.WEAK_DIRT),
    WEAK_WATER("弱い水", Type.init(Types.WATTER), AttackPointOfSpell.WEAK_WATER),
    FIRE("炎", Type.init(Types.FIRE), AttackPointOfSpell.FIRE),
    DIRT("土", Type.init(Types.DIRT), AttackPointOfSpell.DIRT),
    WATER("水", Type.init(Types.WATTER), AttackPointOfSpell.WATER),
    ;
    private final String name;
    private final Type type;
    private final AttackPoint attackPoint;

    Magic(final String name, final Type type, final AttackPoint attackPoint){
        this.name = name;
        this.type = type;
        this.attackPoint = attackPoint;
    };

    public String toString(){
        return this.name;
    }

    public Type getType(){
        return this.type;
    }

    public AttackPoint getAttackPoint() {
        return attackPoint;
    }
}
