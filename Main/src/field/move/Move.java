package field.move;

import java.util.HashMap;
import java.util.Map;

public class Move {
    final static Map<Direction, Action> move = new HashMap<>();
    private Action action;

    private Move(Direction direction){
        move.put(Direction.UP, new UpAction());
        move.put(Direction.DOWN, new DownAction());
        move.put(Direction.RIGHT, new RightAction());
        move.put(Direction.LEFT, new LeftAction());

        this.action = move.get(direction);
    }

    public Move direction(Direction direction){
        return new Move(direction);
    }
}
