package field.point.move;

import field.point.Point;

class UpAction implements Action{

    @Override
    public Point go(Point point) {
        return Point.init(point.getRow() + MoveLength.normal, point.getColumn());
    }

    @Override
    public Point former(Point point) {
        return Point.init(point.getRow(), point.getColumn());
    }
}
