package field;

import character.Character;
import point.Point;

//ここ
public class MoveController {
    private Field field;
    private Character hero;
    private Character enemy;

    private MoveController(Field field){
        this.field = field;
    }
    public static MoveController fieldSet(Field field){
        return new MoveController(field);
    }

    public void move(Character character, Point point){
        if(this.field.isObstacleAhead(point)){
            System.out.println("There are obstacles at the destination. Please specify another point.");
            return ;
        }
        if(this.field.isEncounterEnemy(point)){
            /**
             *
             */
        }

    }
}
