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
                obstacle.typeIs().getName();
    }

    private void fieldSetCharacterName(Character character, Point point){
        this.map[point.getRow()][point.getColumn()] = character.getName();
    }
    public void on(Character character, Point point){
        if(!canExit(point)){
            System.out.println("障害物があるため、そこからスタートすることはできません");
            throw new IllegalArgumentException("入力値が不正です。初期値に障害物があります。");
        }
        fieldSetCharacterName(character, point);
    }

    private boolean canExit(Point point){
        for(Type types : Type.values()){
            if(this.map[point.getRow()][point.getColumn()].equals(types.getName())){
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
        if(!isNothingAhead(point)){
            System.out.println("敵と遭遇！");
            return;
        }
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                if(this.map[i][j].equals(character.getName())){
                    this.map[i][i] = DOT;
                }
            }
        }
        fieldSetCharacterName(character, point);
    }

    private boolean isNothingAhead(Point point){
        return this.map[point.getRow()][point.getColumn()].equals(".");
    }
    public void scene(){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    private Point searchCharcterPoint(Character character){
        for (int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++){
                if(map[i][j].equals(character.getName())){
                    return Point.init(i, j);
                }
            }
        }
        throw new IllegalArgumentException("相手が存在しません。フィールドに敵を設定してください");
    }


    public boolean isEncounter(Character hero, Character enemy){
        if(!searchCharcterPoint(hero).equals(searchCharcterPoint(enemy))){
            return false;
        }
        return true;
    }
}
