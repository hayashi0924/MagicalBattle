package character.hitPoint;

public class HitPoint {
    private final int hitPoint;

    private HitPoint(final int hitPoint){
        this.hitPoint = hitPoint;
    }

    public static HitPoint set(final int hitPoint){
        if(!Decision.setValueWasValid(hitPoint)){
            throw new IllegalArgumentException("体力の入力値が違います。" +
                    Decision.SET_MIN_VALUE + "から" +
                    Decision.SET_MAX_VALUE + "までの間で指定してください");
        }
        return new HitPoint(hitPoint);
    }
    public static HitPoint afterHitPointSet(final int value){
        if(!Decision.afterHitPointWasValid(value)){
            System.out.println("範囲外の数値です。体力は０となります。");
            return new HitPoint(Decision.MIN_VALUE);
        }
        return new HitPoint(value);
    }



}
