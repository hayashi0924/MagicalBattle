package character;

import character.hitPoint.HitPoint;
import character.attackPoint.AttackPoint;
import character.name.Name;
import field.point.Point;
import type.Type;

public class Character {
    private final Name name;
    private HitPoint hitPoint;
    private final AttackPoint attackPoint;
    private final Type type;
    private final Magic magic;
    private final Point point;

    public Character(Name name, HitPoint hitPoint, AttackPoint attackPoint, Type type, Magic magic, Point point){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attackPoint = attackPoint;
        this.type = type;
        this.magic = magic;
        this.point = point;
    }

    public Type typeIs(){
        return this.type;
    }
    public Point pointIs(){ return this.point;}



    private void damaged(final AttackPoint attackPoint){
        this.hitPoint = this.hitPoint.minus(attackPoint);
    }

    //相手に攻撃をする
    //結果：相手のhpを減少させる
    //式：相手のhp - 自分の攻撃力 - 自分の魔法攻撃力
    //備考：相手の苦手タイプで攻撃した場合、魔法攻撃力が2倍になる
    public void attack(Character enemy){
        AttackPoint baseSpellAttackPoint = this.magic.spell().getMagicPoint();
        if(this.type.effective(enemy)){
            enemy.damaged(this.attackPoint.add(baseSpellAttackPoint.effective()));
        }else if(this.type.ineffective(enemy)){
            enemy.damaged(this.attackPoint.add(baseSpellAttackPoint.ineffective()));
        }else{
            enemy.damaged(this.attackPoint.add(baseSpellAttackPoint));
        }
    }

}
