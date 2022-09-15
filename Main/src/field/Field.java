package field;

import character.Character;
import character.move.Direction;
import field.obstacle.Obstacle;
import point.Point;

public class Field {
    private String[][] map = new String[Range.MAX_ROW][Range.MAX_COLUMN];
    private static final String DOT = ".";

    private Field(){
        for(int i =0; Range.rowIsValid(i); i++){
            for(int j = 0; Range.columnIsValid(j); j++){
                map[i][j] = DOT;
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
        this.map[character.pointIs().getRow()][character.pointIs().getColumn()] = character.toString();
    }

    public void normalPoint(Point point){
        this.map[point.getRow()][point.getColumn()] = DOT;
    }

    public void charPoint(Character character){
        this.map[character.pointIs().getRow()][character.pointIs().getColumn()] = character.toString();
    }

    public void charMovement(Character character, Direction direction){
        this.map[character.pointIs().getRow()][character.pointIs().getColumn()] = DOT;
        this.map[character.move(direction).getRow()][character.move(direction).getColumn()] = character.toString();
    }

}
