package character;

import character.attackPoint.AttackPoint;
import character.hitPoint.HitPoint;
import character.magic.Magic;
import character.name.Name;
import field.Field;
import field.obstacle.Obstacle;
import field.obstacle.Type;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import point.Point;

import static character.type.Types.DIRT;
import static character.type.Types.FIRE;
import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    private Character hero =
            new Character(Name.init("林"), HitPoint.init(1000), AttackPoint.init(30),
            character.type.Type.init(FIRE), Magic.FIRE);
    Character enemy =
            new Character(Name.init("早希"), HitPoint.init(100), AttackPoint.init(5),
                    character.type.Type.init(DIRT), Magic.WEAK_DIRT);
    Field field = Field.normalField();


    @Test
    public void testMove(){
        hero.startPoint(field, Point.init(0, 0));
        assertEquals("林", field.hereIs(Point.init(0,0)));
        hero.move(field, Point.init(1, 1));
        assertEquals("林", field.hereIs(Point.init(1,1)));
        assertEquals(".", field.hereIs(Point.init(0, 0)));
    }

    @Test
    public void CharacterBattle(){
        field.obstacleOn(new Obstacle((Type.ROCK), Point.init(5, 5)));
        field.obstacleOn(new Obstacle((Type.WEED), Point.init(6, 6)));

        field.on(hero, Point.init(0, 0));
        field.on(enemy, Point.init(9, 14));

        hero.move(field, Point.init(9, 14));
        hero.encounter(enemy);
        while(hero.isAlive() && enemy.isAlive()) {
            hero.attack(enemy);
            enemy.attack(hero);
        }
        assertTrue(hero.isAlive());
    }
}