package type.compatibility;

import type.Types;

interface CompatibilityCheck {
    Types strong();
    Types weak();
}
