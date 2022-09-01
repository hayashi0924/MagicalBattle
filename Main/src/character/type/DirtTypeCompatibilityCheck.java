package character.type;

public class DirtTypeCompatibilityCheck implements CompatibilityCheck {
    @Override
    public AttributeType strong() {
        return AttributeType.WATTER;
    }

    @Override
    public AttributeType weak() {
        return AttributeType.FIRE;
    }
}
