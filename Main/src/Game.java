import character.Enemy;
import character.Hero;
import character.hitPoint.HitPoint;
import character.magic.Magic;
import character.magicPoint.MagicPoint;
import character.name.Name;
import character.type.Type;
import field.Field;
import coordinate.Coordinate;
import obstacle.Obstacle;

import static character.type.Types.DIRT;
import static character.type.Types.FIRE;
import static obstacle.Type.ROCK;
import static obstacle.Type.WEED;


public class Game {
    public static void main(String[] args) {
        Hero hero =
                new Hero(Name.set("林"), HitPoint.set(1000), MagicPoint.set(30), Type.set(FIRE), Magic.set(FIRE));

        Enemy enemy =
                new Enemy(Name.set("ゴブリン"), HitPoint.set(100), MagicPoint.set(5), Type.set(DIRT), Magic.set(DIRT));

        Field field = Field.create();
        field.set(new Obstacle(ROCK, Coordinate.set(1, 1)));
        field.set(new Obstacle(WEED, Coordinate.set(5, 5)));



    }
}
