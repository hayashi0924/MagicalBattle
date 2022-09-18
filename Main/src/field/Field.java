package field;

import character.Character;
import character.move.Direction;
import character.move.Move;
import field.obstacle.Obstacle;
import field.obstacle.Type;
import point.Point;

import java.util.stream.Collectors;
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

    public void on(Character character, Point point){
        this.map[point.getRow()][point.getColumn()] = character.toString();
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
            throw new IllegalArgumentException("移動先には障害物があります。移動先を変更してください");
        }
        for(String[] maps : this.map){
            Stream.of(maps).filter(characterName -> character.toString().equals(characterName))
                    .map(beforeMove -> DOT).toArray(String[]::new);
        }

        this.map[point.getRow()][point.getColumn()] = character.toString();
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
