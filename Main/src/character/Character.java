package character;

import character.hitPoint.HitPoint;
import character.attackPoint.AttackPoint;
import character.magic.Magic;
import character.move.Direction;
import character.move.Move;
import character.name.Name;
import point.Point;
import character.type.Type;


public class Character {
    private final Name name;
    private HitPoint hitPoint;
    private final AttackPoint attackPoint;
    private final Type type;
    private final Magic magic;

    public Character(Name name, HitPoint hitPoint, AttackPoint attackPoint, Type type, Magic magic) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attackPoint = attackPoint;
        this.type = type;
        this.magic = magic;

    }

    public Type typeIs() {
        return this.type;
    }

    private void damaged(final AttackPoint attackPoint) {
        this.hitPoint = this.hitPoint.minus(attackPoint);
    }

    //相手に攻撃をする
    //結果：相手のhpを減少させる
    //式：相手のhp - 自分の攻撃力 - 自分の魔法攻撃力
    //備考：相手の苦手タイプで攻撃した場合、魔法攻撃力が2倍になる
    public void attack(Character enemy) {
        AttackPoint baseMagicAttackPoint = this.magic.getAttackPoint();

        boolean compatibilityIsEffective = this.type.getWeakType() == enemy.type.getStrongType();
        boolean compatibilityIsIneffective = this.type.getStrongType() == enemy.type.getWeakType();

        if (compatibilityIsEffective) {
            enemy.damaged(this.attackPoint.add(baseMagicAttackPoint.effective()));
            return;
        }
        if (compatibilityIsIneffective) {
            enemy.damaged(this.attackPoint.add(baseMagicAttackPoint.ineffective()));
            return;
        }
        enemy.damaged(this.attackPoint.add(baseMagicAttackPoint));
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Character object)) {
            return false;
        }
        boolean valid = object.name.equals(this.name) && object.hitPoint.equals(this.hitPoint) && object.attackPoint.equals(this.attackPoint)
                && object.magic.equals(this.magic) && object.type.equals(this.type);
        return valid;
    }

    public String getName(){
        return this.name.is();
    }
    public String toString() {
        return this.name.toString();
    }

}
