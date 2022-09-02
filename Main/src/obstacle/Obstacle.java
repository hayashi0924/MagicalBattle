package obstacle;

import coordinate.Coordinate;

public class Obstacle {
    private final Coordinate coordinate;
    private final Type type;

    public Obstacle(Type type, Coordinate coordinate){
        this.type = type;
        this.coordinate = coordinate;
    }

    public Coordinate coordinateIs(){
        return this.coordinate;
    }
    public Type typeIs(){
        return this.type;
    }

}
