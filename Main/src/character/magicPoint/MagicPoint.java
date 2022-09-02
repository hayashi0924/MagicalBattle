package character.magicPoint;

public class MagicPoint {
    private final int magicPoint;

    private MagicPoint(final int magicPoint){
        this.magicPoint = magicPoint;
    }

    public static MagicPoint set(final int value){
        if(!Decision.wasValid(value)){
            throw new IllegalArgumentException("マジックポイントは" +
                    Decision.MIN_VALUE + "から" +
                    Decision.MAX_VALUE + "までの間で指定してください");
        }
        return new MagicPoint(value);
    }

    private MagicPoint add(final MagicPoint magicPoint){
        final int adding = this.magicPoint + magicPoint.magicPoint;
        return new MagicPoint(adding);
    }
}
