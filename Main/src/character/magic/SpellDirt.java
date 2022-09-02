package character.magic;

import character.magicPoint.MagicPoint;

public class SpellDirt implements Spell{
    private static final int dirtDamage = 5;
    @Override
    public MagicPoint chant() {
        return MagicPoint.set(dirtDamage);
    }
}
