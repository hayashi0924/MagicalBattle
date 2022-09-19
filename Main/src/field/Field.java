package field;

import character.Character;
import character.move.Direction;
import field.obstacle.Obstacle;
import field.obstacle.Type;
import point.Point;

import java.util.Arrays;
import java.util.stream.Stream;

public class Field {
    private String[][] map = new String[Range.MAX_ROW][Range.MAX_COLUMN];
    private static final String DOT = ".";

    private Field(){
        for(int i =0; Range.rowIsValid(i - 1); i++){
            for(int j = 0; Range.columnIsValid(j - 1); j++){
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

    private boolean canMove(Point point){
        for(Type types : Type.values()){
            if(this.map[point.getRow()][point.getColumn()].equals(types.toString())){
                return false;
            }
        }
        return true;
    }

    public void move(Character character, Point point){
        if(!canMove(point)){
            System.out.println("障害物のあるマスです。別の座標を指定してください。指定したマス:横" + point.getRow() + "縦：" + point.getColumn());
            return;
        }
        for(String[] maps : this.map){
            Stream.of(maps).filter(characterName -> character.toString().equals(characterName))
                    .map(beforeMove -> DOT).toArray(String[]::new);
        }
        this.map[point.getRow()][point.getColumn()] = character.toString();
    }

    public void scene(){
        Stream.of(map).forEach(System.out::println);
    }
}
