package character;

import character.attackPoint.AttackPoint;
import character.hitPoint.HitPoint;
import character.magic.Magic;
import character.name.Name;
import field.Field;
import org.junit.jupiter.api.Test;
import point.Point;

import static character.type.Types.FIRE;
import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @Test
    public void testMove(){
        Field field = Field.normalField();
        Character hero = new Character(Name.init("林"), HitPoint.init(1000), AttackPoint.init(30),
                character.type.Type.init(FIRE), Magic.FIRE);
        hero.startPoint(field, Point.init(0, 0));
        assertEquals("林", field.hereIs(Point.init(0,0)));
        hero.move(field, Point.init(1, 1));
        assertEquals("林", field.hereIs(Point.init(1,1)));
        assertEquals(".", field.hereIs(Point.init(0, 0)));
    }

}