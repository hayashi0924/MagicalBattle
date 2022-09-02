package character.magic;

import character.magicPoint.MagicPoint;

public class SpellFire implements Spell{
    private static final int fireDamage = 5;
    @Override
    public MagicPoint chant() {
        return MagicPoint.set(fireDamage);
    }
}
