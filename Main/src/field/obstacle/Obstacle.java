package field.obstacle;

import point.Point;

public class Obstacle {
    private final Point point;
    private final Type type;

    public Obstacle(Type type, Point point){
        this.type = type;
        this.point = point;
    }

    public Point pointIs(){
        return this.point;
    }
    public Type typeIs(){
        return this.type;
    }

}
