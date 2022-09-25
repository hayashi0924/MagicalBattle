package field;

import character.Character;
import field.obstacle.Obstacle;
import field.obstacle.Type;
import point.Point;


public class Field {
    private String[][] map;
    private static final String DOT = ".";

    private Field(){
        this.map = new String[Range.MAX_ROW][Range.MAX_COLUMN];
        for(int i =0; i < Range.MAX_ROW; i++){
            for(int j = 0; j < Range.MAX_COLUMN; j++){
                map[i][j] = DOT;
            }
        }
    }

    public static Field create(){
        return new Field();
    }
    public void obstacleOn(Obstacle obstacle){
        this.map[obstacle.pointIs().getRow()][obstacle.pointIs().getColumn()] =
                obstacle.typeIs().getName();
    }
    public void on(Character character, Point point){
        if(isObstacleAhead(point)){
            System.out.println("障害物があるため、そこからスタートすることはできません");
            throw new IllegalArgumentException("入力値が不正です。初期値に障害物があります。");
        }
        fieldSetCharacterName(character, point);
    }
    private void fieldSetCharacterName(Character character, Point point){
        this.map[point.getRow()][point.getColumn()] = character.getName();
    }


    boolean isObstacleAhead(Point point){
        for(Type types : Type.values()){
            if(this.map[point.getRow()][point.getColumn()].equals(types.getName())){
                return true;
            }
        }
        return false;
    }
    boolean isNothingAhead(Point point){
        return this.map[point.getRow()][point.getColumn()].equals(".");
    }
    boolean isEncounterEnemy(Point point){
        return !(!isObstacleAhead(point) && isNothingAhead(point));
    }


    void move(Character character, Point point){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                if(this.map[i][j].equals(character.getName())){
                    this.map[i][i] = DOT;
                }
            }
        }
        fieldSetCharacterName(character, point);
    }
    public void scene(){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
