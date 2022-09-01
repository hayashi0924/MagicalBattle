package character.hitPoint;

public class HitPoint {
    final int hitPoint;

    private HitPoint(final int hitPoint){
        this.hitPoint = hitPoint;
    }

    public static HitPoint set(final int hitPoint){
        if(!Decision.wasValid(hitPoint)){
            throw new IllegalArgumentException("体力の入力値が違います。" +
                    Decision.MIN_VALUE + "から" +
                    Decision.MAX_VALUE + "までの間で指定してください");
        }
        return new HitPoint(hitPoint);
    }

}
