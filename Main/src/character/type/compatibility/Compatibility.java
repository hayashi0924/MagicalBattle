package character.type.compatibility;

import character.type.Types;

import java.util.HashMap;
import java.util.Map;

public class Compatibility {
    private final Map<Types, CompatibilityCheck> typeMeasure;

   public Compatibility(){
       typeMeasure = new HashMap<>();
        typeMeasure.put(Types.FIRE, new FireTypeCompatibilityCheck());
        typeMeasure.put(Types.WATTER, new WaterTypeCompatibilityCheck());
        typeMeasure.put(Types.DIRT, new DirtTypeCompatibilityCheck());
    }

    public Types weak(Types type){
       new Compatibility();
       return typeMeasure.get(type).weak();
    }
    public Types strong(Types type){
       new Compatibility();
       return typeMeasure.get(type).strong();
    }

}
