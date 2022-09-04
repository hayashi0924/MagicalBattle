package point;

import field.Range;

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

    public Point moveUp(){
        return init(this.row + MoveLength.normal, this.column);
    }
    public Point moveDown(){
        return init(this.row - MoveLength.normal, this.column);
    }
    public Point moveLeft(){
        return init(this.row, this.column - MoveLength.normal);
    }
    public Point moveRight(){
        return init(this.row, this.column + MoveLength.normal);
    }


    public int getRow(){
        return this.row;
    }
    public int getColumn(){
        return this.column;
    }

}
