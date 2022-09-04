package character.magicPoint;

public class MagicPoint {
    private final int magicPoint;

    private MagicPoint(final int magicPoint){
        this.magicPoint = magicPoint;
    }

    public static MagicPoint init(final int value){
        if(!Decision.isValid(value)){
            throw new IllegalArgumentException("マジックポイントは" +
                    Decision.MIN_VALUE + "から" +
                    Decision.MAX_VALUE + "までの間で指定してください");
        }
        return new MagicPoint(value);
    }

    public MagicPoint add(final MagicPoint magicPoint){
        final int adding = this.magicPoint + magicPoint.magicPoint;
        return new MagicPoint(adding);
    }
    public MagicPoint effective(){
        final int effectiveRate = 2;
        final int effectivePoint = this.magicPoint * effectiveRate;
        return new MagicPoint(effectivePoint);
    }
    public MagicPoint ineffective(){
        final double ineffectiveRate = 0.5;
        final double ineffectivePoint = this.magicPoint * ineffectiveRate;
        return new MagicPoint((int)ineffectivePoint);
    }

    public int getMagicPoint(){
        return this.magicPoint;
    }
}
