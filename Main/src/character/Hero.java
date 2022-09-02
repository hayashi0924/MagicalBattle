package character;

import character.magic.Magic;
import character.type.Type;
import character.hitPoint.HitPoint;
import character.magicPoint.MagicPoint;
import character.name.Name;
import coordinate.Coordinate;

public class Hero {
    private final Name name;
    private final HitPoint hitPoint;
    private final MagicPoint magicPoint;
    private final Type type;
    private final Magic magic;
    private final Coordinate coordinate;

    public Hero(Name name, HitPoint hitPoint, MagicPoint magicPoint, Type type, Magic magic){
        this.name = name;
        this.hitPoint = hitPoint;
        this.magicPoint = magicPoint;
        this.type = type;
        this.magic = magic;
        this.coordinate = Coordinate.set(0, 0);
    }

    public Type typeIs(){
        return this.type;
    }

    /**
     * 疑問：MagicPointクラスで、intに変換する方法でよかったのか
     * 　⇨MagicPointクラスのintをパブリックにしないのはなぜか
     * @param magicPoint 敵の魔法力
     * @return HitPoint 攻撃
     */
    public HitPoint damaged(final MagicPoint magicPoint){
        final int afterValueOfHitPoint = magicPoint.getMagicPoint();
        return HitPoint.afterHitPointSet(afterValueOfHitPoint);
    }

    public void chant(Enemy enemy){
        enemy.damaged(this.magicPoint.add(this.magic.chant()));
    }

}
