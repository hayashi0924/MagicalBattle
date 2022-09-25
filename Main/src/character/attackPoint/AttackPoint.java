package character.attackPoint;

public class AttackPoint {
    private final int attackPoint;
    private final static int EFFECTIVE_RATE = 2;
    private final static double INEFFECTIVE_RATE = 0.5;

    private AttackPoint(final int attackPoint){
        this.attackPoint = attackPoint;
    }

    public static AttackPoint init(final int value){
        if(!Decision.isValid(value)){
            throw new IllegalArgumentException("マジックポイントは" +
                    Decision.MIN_VALUE + "から" +
                    Decision.MAX_VALUE + "までの間で指定してください");
        }
        return new AttackPoint(value);
    }

    public AttackPoint add(final AttackPoint attackPoint){
        final int adding = this.attackPoint + attackPoint.attackPoint;
        return new AttackPoint(adding);
    }
    public AttackPoint effective(){
        final int effectivePoint = this.attackPoint * EFFECTIVE_RATE;
        return new AttackPoint(effectivePoint);
    }
    public AttackPoint ineffective(){
        final double ineffectivePoint = this.attackPoint * INEFFECTIVE_RATE;
        return new AttackPoint((int)ineffectivePoint);
    }

    public int getAttackPoint(){
        return this.attackPoint;
    }
}
