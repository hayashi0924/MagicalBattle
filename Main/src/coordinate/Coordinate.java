package coordinate;

import field.Range;

public class Coordinate {
    private final int row;
    private final int column;

    private Coordinate(final int row, final int column){
        this.row = row;
        this.column = column;
    }

    public static Coordinate set(final int row, final int column){
        if(!Range.isValid(row, column)){
            throw new IllegalArgumentException("入力値が不正です");
        }
        return new Coordinate(row, column);
    }

    public int rowIs(){
        return this.row;
    }
    public int columnIs(){
        return this.column;
    }

}
