package type.compatibility;

import type.Types;

class DirtTypeCompatibilityCheck implements CompatibilityCheck {
    @Override
    public Types strong() {
        return Types.WATTER;
    }

    @Override
    public Types weak() {
        return Types.FIRE;
    }
}