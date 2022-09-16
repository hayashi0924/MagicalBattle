package field;

import character.Character;
import character.move.Direction;
import field.obstacle.Obstacle;
import point.Point;

import java.util.stream.Stream;

public class Field {
    private String[][] map;
    private static final String DOT = ".";

    private Field(){
        this.map = new String[Range.MAX_ROW][Range.MAX_COLUMN];
        for(int i = 0; i < Range.MAX_ROW; i++){
            for(int j = 0; j < Range.MAX_COLUMN; j++){
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

    public void scene() {
        for(int i = 0; i < Range.MAX_ROW; i++){
            for(int j = 0; j < Range.MAX_COLUMN; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
