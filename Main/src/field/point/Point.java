package field.point;

import field.Range;
import field.point.move.Move;

public class Point {
    private final int row;
    private final int column;

    private Point(final int row, final int column){
        this.row = row;
        this.column = column;
    }

    public static Point init(final int row, final int column){
        if(!Range.isValid(row, column)){
            throw new IllegalArgumentException("入力値が不正です");
        }
        return new Point(row, column);
    }

    public int getRow(){
        return this.row;
    }
    public int getColumn(){
        return this.column;
    }
}
