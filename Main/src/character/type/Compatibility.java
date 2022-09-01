package character.type;

import java.util.HashMap;
import java.util.Map;

public class Compatibility {
    private static final Map<AttributeType, CompatibilityCheck> typeMeasure = new HashMap<>();

    Compatibility(){
        typeMeasure.put(AttributeType.FIRE, new FireTypeCompatibilityCheck());
        typeMeasure.put(AttributeType.WATTER, new WaterTypeCompatibilityCheck());
        typeMeasure.put(AttributeType.DIRT, new DirtTypeCompatibilityCheck());
    }

    AttributeType weak(AttributeType type){
        return typeMeasure.get(type).weak();
    }
    AttributeType strong(AttributeType type){
        return typeMeasure.get(type).strong();
    }

}
