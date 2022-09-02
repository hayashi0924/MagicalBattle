package character.magic;

import character.magicPoint.MagicPoint;
import character.type.Type;
import character.type.Types;

import java.util.HashMap;
import java.util.Map;

import static character.type.Types.*;

public class Magic {
    private static final Map<Type, Spell> magics = new HashMap<>();
    private final Type type;
    /**
     * 魔法に魔法攻撃力の概念はないのではと考え、
     * 詠唱フィールドとした。
     * 詠唱フィールドが魔法攻撃力を返す使用だが、
     * この考えは正しいのか。
     */
    private final Spell spell;

    private Magic(final Type type, final Spell spell){
        this.type = type;
        this.spell = spell;
    }

    public static Magic set(Types type) {
        magics.put(Type.set(FIRE), new SpellFire());
        magics.put(Type.set(WATTER), new SpellWater());
        magics.put(Type.set(DIRT), new SpellDirt());

        final Type select = Type.set(type);
        return new Magic(select, magics.get(select));
    }

    public MagicPoint chant(){
        return this.spell.chant();
    }
    public Type attributes(){ return this.type; }
}
