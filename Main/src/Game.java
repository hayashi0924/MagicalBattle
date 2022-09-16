import character.Character;
import character.hitPoint.HitPoint;
import character.magic.Magic;
import character.attackPoint.AttackPoint;
import character.name.Name;
import character.type.Types;
import field.Field;
import field.obstacle.Obstacle;
import field.obstacle.Type;
import point.Point;
import static character.type.Types.DIRT;
import static character.type.Types.FIRE;

public class Game {
    public static void main(String[] args) {
        Character hero =
                new Character(Name.init("林"), HitPoint.init(1000), AttackPoint.init(30),
                        character.type.Type.init(FIRE), Magic.FIRE, Point.init(0, 0));

        Character enemy =
                new Character(Name.init("早希"), HitPoint.init(100), AttackPoint.init(5),
                        character.type.Type.init(DIRT), Magic.WEAK_DIRT, Point.init(10, 12));

        Field field = Field.create();
        field.obstacleInit(new Obstacle((Type.ROCK), Point.init(5, 5)));
        field.obstacleInit(new Obstacle((Type.WEED), Point.init(6, 6)));
        
    }
}
