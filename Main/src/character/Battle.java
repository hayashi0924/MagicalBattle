package character;

class Battle {
    private Character hero;
    private Character enemy;
    //ここ
    private Character victory;

    private Battle(Character hero, Character enemy){
        this.hero = hero;
        this.enemy = enemy;
    }

    //ここ
    public static Battle start(Character hero, Character enemy){
        return new Battle(hero, enemy);
    }

    // Battle battle = Battle.start(hero, enemy);
    // Character hoge = battle.victoryChar();
    //ここ
    public Character victoryChar(){
        while(this.hero.isAlive() && this.enemy.isAlive()){
            hero.attack(enemy);
            System.out.println(hero + "の攻撃");
            enemy.attack(hero);
            System.out.println(enemy + "の攻撃");
        }
        Character victory = hero.isAlive() ? hero : enemy;
        return victory;
    }
}
