package character.hitPoint;

import character.magicPoint.MagicPoint;

public class HitPoint {
    private final int hitPoint;

    private HitPoint(final int hitPoint){
        this.hitPoint = hitPoint;
    }

    public static HitPoint init(final int hitPoint){
        if(!Decision.setValueWasValid(hitPoint)){
            throw new IllegalArgumentException("体力の入力値が違います。" +
                    Decision.SET_MIN_VALUE + "から" +
                    Decision.SET_MAX_VALUE + "までの間で指定してください");
        }
        return new HitPoint(hitPoint);
    }

    /**
     * ダメージ計算後のヒットポイントを作るファクトリメソッド
     * @param value
     * @return
     */
    public static HitPoint attach(final int value){
        if(!Decision.afterHitPointWasValid(value)){
            System.out.println("範囲外の数値です。体力は０となります。");
            return new HitPoint(Decision.MIN_VALUE);
        }
        return new HitPoint(value);
    }

    public int getValue(){
        return this.hitPoint;
    }

    /**
     * 現在のヒットポイントから、マジックポイントを引いた値を返す。
     */
    public HitPoint minus(final MagicPoint magicPoint){
        // まずは引く
        final int after = this.hitPoint - magicPoint.getMagicPoint();
        return attach(after);
    }
}
