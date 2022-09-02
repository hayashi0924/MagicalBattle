package field;

public class Range {
    static final int MIN_ROW = 0;
    static final int MAX_ROW = 10;
    static final int MIN_COLUMN = 0;
    static final int MAX_COLUMN = 15;

    static boolean rowIsValid(final int row){
        return MIN_ROW <= row && row <= MAX_ROW;
    }
    static boolean columnIsValid(final int column){
        return MIN_COLUMN <= column && column <= MAX_COLUMN;
    }
    public static boolean isValid(final int row, final int column){
        return rowIsValid(row) && columnIsValid(column);
    }
}
