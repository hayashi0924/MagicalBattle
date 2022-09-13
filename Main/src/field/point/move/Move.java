package field.point.move;

import field.point.Point;

import java.util.HashMap;
import java.util.Map;

public class Move {
    private final static Map<Direction, Action> move = new HashMap<>();

    private Move(){
        move.put(Direction.UP, new UpAction());
        move.put(Direction.DOWN, new DownAction());
        move.put(Direction.RIGHT, new RightAction());
        move.put(Direction.LEFT, new LeftAction());
    }

    public Action moveDown(){
        return move.get(Direction.DOWN);
    }
    public Action moveUp(){
        return move.get(Direction.UP);
    }
    public Action moveRight(){
        return move.get(Direction.RIGHT);
    }
    public Action moveLeft(){
        return move.get(Direction.LEFT);
    }
}
