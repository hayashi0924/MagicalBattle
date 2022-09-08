package character.attackPoint;

public class AttackPoint {
    private final int magicPoint;

    private AttackPoint(final int magicPoint){
        this.magicPoint = magicPoint;
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
        final int adding = this.magicPoint + attackPoint.magicPoint;
        return new AttackPoint(adding);
    }
    public AttackPoint effective(){
        final int effectiveRate = 2;
        final int effectivePoint = this.magicPoint * effectiveRate;
        return new AttackPoint(effectivePoint);
    }
    public AttackPoint ineffective(){
        final double ineffectiveRate = 0.5;
        final double ineffectivePoint = this.magicPoint * ineffectiveRate;
        return new AttackPoint((int)ineffectivePoint);
    }

    public int getMagicPoint(){
        return this.magicPoint;
    }
}
