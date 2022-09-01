package character.type;

public class FireTypeCompatibilityCheck implements CompatibilityCheck {

    @Override
    public AttributeType strong() {
        return AttributeType.DIRT;
    }

    @Override
    public AttributeType weak() {
        return AttributeType.WATTER;
    }
}
