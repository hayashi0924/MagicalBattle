package field;

import character.Character;
import field.move.Direction;
import field.obstacle.Obstacle;
import character.*;

public class Field {
    private String[][] map = new String[Range.MAX_ROW][Range.MAX_COLUMN];

    private Field(){
        for(int i =0; Range.rowIsValid(i); i++){
            for(int j = 0; Range.columnIsValid(j); j++){
                map[i][j] = ".";
            }
        }
    }



    public static Field create(){
        return new Field();
    }
    public void obstacleInit(Obstacle obstacle){
        this.map[obstacle.pointIs().getRow()][obstacle.pointIs().getColumn()] =
                obstacle.typeIs().toString();
    }

    public void Position(Character character){
        this.map[character.pointIs().getRow()][character.pointIs().getColumn()] = "人";
    }


    public void move(Direction direction){

    }

}
