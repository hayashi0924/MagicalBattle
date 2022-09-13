package character.type.compatibility;

import character.type.Types;

class WaterTypeCompatibilityCheck implements CompatibilityCheck {
    @Override
    public Types strong() {
        return Types.FIRE;
    }

    @Override
    public Types weak() {
        return Types.DIRT;
    }
}
