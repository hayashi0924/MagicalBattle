package field.point.move;

import field.point.Point;

import java.util.HashMap;
import java.util.Map;

public class Move {
    private final static Map<Direction, Action> move = new HashMap<>();

    {
        move.put(Direction.UP, new Up());
        move.put(Direction.DOWN, new Down());
        move.put(Direction.RIGHT, new Right());
        move.put(Direction.LEFT, new Left());
    }

    public Action move(Direction direction){
        return move.get(direction);
    }

}
