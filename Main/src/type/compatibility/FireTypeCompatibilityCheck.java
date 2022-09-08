package type.compatibility;

import type.Types;

class FireTypeCompatibilityCheck implements CompatibilityCheck {

    @Override
    public Types strong() {
        return Types.DIRT;
    }

    @Override
    public Types weak() {
        return Types.WATTER;
    }
}
