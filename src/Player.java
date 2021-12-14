public class Player {
    private int hp;

    public Player(int initialHp) {
        hp = initialHp;
    }

    int getHp() {
        return hp;
    }

    void setHp(int newHp) {
        hp = newHp;

        if (hp < 0) {
            hp = 0;
        }
    }

    void damage(int value) {
        hp -= value;

        if (hp < 0) {
            hp = 0;
        }
    }

    boolean isAlive() {
        return hp > 0;
    }

    @Override
    public String toString() {
       return "hp: " + hp + ", isAlive: " + isAlive();
    }

    public void useWeapon(Weapon weapon) {
        System.out.println("Use weapon " + weapon.getName() + ", damage: " + weapon.getDamage());
    }
}
