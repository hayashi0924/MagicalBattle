package character.type;

public class WaterTypeCompatibilityCheck implements CompatibilityCheck {
    @Override
    public AttributeType strong() {
        return AttributeType.FIRE;
    }

    @Override
    public AttributeType weak() {
        return AttributeType.DIRT;
    }
}
