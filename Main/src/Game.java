import character.Character;
import character.hitPoint.HitPoint;
import character.magic.Magic;
import character.magic.SpellList;
import character.magicPoint.MagicPoint;
import character.name.Name;
import field.point.Point;
import type.Type;

import static type.Types.DIRT;
import static type.Types.FIRE;


public class Game {
    public static void main(String[] args) {
        Character hero =
                new Character(Name.init("林"), HitPoint.init(1000), MagicPoint.init(30),
                        Type.init(FIRE), Magic.init(SpellList.FIRE), Point.init(0, 0));

        Character enemy =
                new Character(Name.init("ゴブリン"), HitPoint.init(100), MagicPoint.init(5),
                        Type.init(DIRT), Magic.init(SpellList.WEAK_DIRT), Point.init(10, 12));

        /*Field field = Field.create();
        field.init(new Obstacle(ROCK, Point.init(1, 1)));
        field.init(new Obstacle(WEED, Point.init(5, 5)));
        */


    }
}
