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

    public void obstacleInit(Obstacle obstacle){
        this.map[obstacle.pointIs().getRow()][obstacle.pointIs().getColumn()] =
                obstacle.typeIs().toString();
    }

    public void on(Character character, Point point){
        if(!canExit(point)){
            System.out.println("障害物があるため、そこからスタートすることはできません");
            return ;
        }
        this.map[point.getRow()][point.getColumn()] = character.toString();
    }

    private boolean canExit(Point point){
        for(Type types : Type.values()){
            if(this.map[point.getRow()][point.getColumn()].equals(types.toString())){
                return false;
            }
        }
        return true;
    }

    public void move(Character character, Point point){
        if(!canExit(point)){
            System.out.println("障害物のあるマスです。別の座標を指定してください。指定したマス:横" + point.getRow() + "縦：" + point.getColumn());
            return;
        }
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                if(this.map[i][j].equals(character.toString())){
                    this.map[i][i] = DOT;
                }
            }
        }
        this.map[point.getRow()][point.getColumn()] = character.toString();
    }

    public void scene(){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    private Point searchCharacter(Character character){
        for (int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++){
                if(map[i][j].equals(character.toString())){
                    return Point.init(i, j);
                }
            }
        }
        throw new IllegalArgumentException("相手が存在しません。フィールドに敵を設定してください");
    }

    public boolean isEncounter(Character hero, Character enemy){
        if(!searchCharacter(hero).equals(searchCharacter(enemy))){
            return false;
        }
        return true;
    }
}
