import character.Character;
import character.hitPoint.HitPoint;
import character.magic.Magic;
import character.attackPoint.AttackPoint;
import character.name.Name;
import field.point.Point;
import character.type.Type;

import static character.type.Types.DIRT;
import static character.type.Types.FIRE;


public class Game {
    public static void main(String[] args) {
        Character hero =
                new Character(Name.init("林"), HitPoint.init(1000), AttackPoint.init(30),
                        Type.init(FIRE), Magic.FIRE, Point.init(0, 0));

        Character enemy =
                new Character(Name.init("ゴブリン"), HitPoint.init(100), AttackPoint.init(5),
                        Type.init(DIRT), Magic.WEAK_DIRT, Point.init(10, 12));




    }
}
