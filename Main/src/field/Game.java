package field;

import character.Character;
import point.Point;

public class Game {
    private Field field;

    Game(Field field){
        this.field = Field.create();
    }

    public void move(Character character, Point point){
        if(this.field.isObstacleAhead(point)){
            System.out.println("There are obstacles at the destination. Please specify another point.");
            return ;
        }
        if(this.field.isNothingAhead(point)){
            this.field.move(character, point);
            return;
        }

    }
}
