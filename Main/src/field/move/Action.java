package field.move;

import field.point.Point;

interface Action {
    Point go(Point point);
    Point former(Point point);
}
