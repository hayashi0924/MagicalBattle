package character.move;

import point.Point;

public interface Action {
    Point go(Point point);
    Point former(Point point);
}
