package field;

import character.Character;
import point.Point;

public class MoveController {
    private Field field;

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
             * バトル開始。
             * 詳細は別クラスで定義
             * 勝ったら処理継続。負けたら処理を中断し、ゲームが終わる。
             */
        }
        this.field.move(character, point);
    }
}
