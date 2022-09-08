package type;

import java.util.HashMap;
import java.util.Map;

public class Compatibility {
    private static final Map<Types, CompatibilityCheck> typeMeasure = new HashMap<>();

    Compatibility(){
        typeMeasure.put(Types.FIRE, new FireTypeCompatibilityCheck());
        typeMeasure.put(Types.WATTER, new WaterTypeCompatibilityCheck());
        typeMeasure.put(Types.DIRT, new DirtTypeCompatibilityCheck());
    }

    Types weak(Types type){
        return typeMeasure.get(type).weak();
    }
    Types strong(Types type){
        return typeMeasure.get(type).strong();
    }

}
