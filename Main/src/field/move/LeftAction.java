package field.move;

import field.point.Point;

class LeftAction implements Action{
    @Override
    public Point go(Point point) {
        return Point.init(point.getRow(), point.getColumn() - MoveLength.normal);
    }

    @Override
    public Point former(Point point) {
        return Point.init(point.getRow(), point.getColumn());
    }
}
