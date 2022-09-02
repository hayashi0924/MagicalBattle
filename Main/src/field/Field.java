package field;

import obstacle.Obstacle;

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
    public void set(Obstacle obstacle){
        this.map[obstacle.coordinateIs().rowIs()][obstacle.coordinateIs().columnIs()] =
                obstacle.typeIs().toString();
    }
}
