package field.point.move;

import field.point.Point;

class Left implements Action{
    @Override
    public Point go(Point point) {
        return Point.init(point.getRow(), point.getColumn() - MoveLength.normal);
    }

    @Override
    public Point former(Point point) {
        return Point.init(point.getRow(), point.getColumn());
    }
}
