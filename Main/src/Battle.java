public class Battle {
    private Character hero;
    private Character enemy;

    private Battle(Character hero, Character enemy){
        this.hero = hero;
        this.enemy = enemy;
    }

    public static Battle start(Character hero, Character enemy){
        return new Battle(hero, enemy);
    }

    public void attack(Character from, Character to){

    }
}
