package character.magic;

import character.magicPoint.MagicPoint;

public class SpellWater implements Spell{
    private static final int waterDamage = 5;
    @Override
    public MagicPoint chant() {
        return MagicPoint.set(waterDamage);
    }
}
