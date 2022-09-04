package character.magic;

import type.Type;
import type.Types;

import java.util.HashMap;
import java.util.Map;

public class Magic {
    private final SpellList spellList;
    private final Spell spell;


    private Magic(SpellList spellList, Spell spell){
        this.spellList = spellList;
        this.spell = spell;
    }

    public static Magic init(final SpellList spellList){
        final Map<SpellList, Spell> magic = new HashMap<>();
        magic.put(SpellList.WEAK_FIRE, new Spell(SpellAndPoint.WEAK_FIRE, Type.init(Types.FIRE)));
        magic.put(SpellList.WEAK_DIRT, new Spell(SpellAndPoint.WEAK_DIRT, Type.init(Types.DIRT)));
        magic.put(SpellList.WEAK_WATER, new Spell(SpellAndPoint.WEAK_WATER, Type.init(Types.WATTER)));
        magic.put(SpellList.FIRE, new Spell(SpellAndPoint.FIRE, Type.init(Types.FIRE)));
        magic.put(SpellList.DIRT, new Spell(SpellAndPoint.DIRT, Type.init(Types.DIRT)));
        magic.put(SpellList.WATER, new Spell(SpellAndPoint.WATER, Type.init(Types.WATTER)));

        return new Magic(spellList, magic.get(spellList));
    }
    public Spell spell(){
        return this.spell;
    }
}
