package character;

import character.hitPoint.HitPoint;
import character.magic.Magic;
import character.magicPoint.MagicPoint;
import character.name.Name;
import point.Point;
import type.Type;

public class Character {
    private final Name name;
    private HitPoint hitPoint;
    private final MagicPoint magicPoint;
    private final Type type;
    private final Magic magic;
    private final Point point;

    public Character(Name name, HitPoint hitPoint, MagicPoint magicPoint, Type type, Magic magic, Point point){
        this.name = name;
        this.hitPoint = hitPoint;
        this.magicPoint = magicPoint;
        this.type = type;
        this.magic = magic;
        this.point = point;
    }

    public Type typeIs(){
        return this.type;
    }



    public void damaged(final MagicPoint magicPoint){
        this.hitPoint = this.hitPoint.minus(magicPoint);
    }

    //相手に攻撃をする
    //結果：相手のhpを減少させる
    //式：相手のhp - 自分の攻撃力 - 自分の魔法攻撃力
    //備考：相手の苦手タイプで攻撃した場合、魔法攻撃力が2倍になる
    public void attack(Character enemy){
        MagicPoint baseSpellMagicPoint = this.magic.spell().getMagicPoint();
        if(this.type.effective(enemy)){
            enemy.damaged(this.magicPoint.add(baseSpellMagicPoint.effective()));
        }else if(this.type.ineffective(enemy)){
            enemy.damaged(this.magicPoint.add(baseSpellMagicPoint.ineffective()));
        }else{
            enemy.damaged(this.magicPoint.add(baseSpellMagicPoint));
        }
    }

}
