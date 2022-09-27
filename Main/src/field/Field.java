package field;

import character.Character;
import field.obstacle.Obstacle;
import field.obstacle.Type;
import point.Point;


public class Field {
    private String[][] map = new String[Range.MAX_ROW][Range.MAX_COLUMN];
    private static final String DOT = ".";

    //ここ
    //障害物はcreateの時にあると良いかも
    //コンストラクタの引数
    private Field(String[][] map){
        this.map = map;
    }

    public static Field normalStage(){
        String[][] nomalField = new String[Range.MAX_ROW][Range.MAX_COLUMN];
        for (int i = 0; i < nomalField.length; i++) {
            for (int j = 0; j < nomalField[i].length; j++) {
                nomalField[i][i] = DOT;
            }
        }
        return new Field(nomalField);
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


    public void deployment(Character character, Point point){
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
