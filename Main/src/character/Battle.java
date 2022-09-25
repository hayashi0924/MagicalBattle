package character;

class Battle {
    private Character hero;
    private Character enemy;
    private Character victory;

    private Battle(Character hero, Character enemy){
        this.hero = hero;
        this.enemy = enemy;
    }

    public static Battle start(Character hero, Character enemy){
        return new Battle(hero, enemy);
    }

    public Character victoryChar(Character hero, Character enemy){
        while(hero.isAlive() && enemy.isAlive()){
            hero.attack(enemy);
            System.out.println(hero + "の攻撃");
            enemy.attack(hero);
            System.out.println(enemy + "の攻撃");
        }
        Character victory = hero.isAlive() ? hero : enemy;
        return Character.BattleWinner(victory);
    }
}
