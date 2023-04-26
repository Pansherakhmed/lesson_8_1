package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Wither extends Hero {
    public Wither(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.WITHER);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getDamage() > 0){
            this.setDamage(0);

        }
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <= 0){
                heroes[i].setHealth(heroes[i].getHealth() + this.getHealth());
                this.setHealth(0);
            }
            break;
        }
    }
}
