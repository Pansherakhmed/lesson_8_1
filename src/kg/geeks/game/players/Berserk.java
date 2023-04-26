package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Berserk extends Hero {
    private int blockedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BLOCK_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
     int damage = RPG_Game.random.nextInt(50);
     setBlockedDamage(this.getDamage() + damage);
     boss.setHealth(boss.getHealth() - getBlockedDamage());
    }

    public void setBlockedDamage(int blockedDamage) {
        this.blockedDamage = blockedDamage;
    }

    public int getBlockedDamage() {
        return blockedDamage;
    }

}
