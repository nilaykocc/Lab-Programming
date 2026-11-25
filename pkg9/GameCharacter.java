
package week.pkg9;


public abstract class GameCharacter {
    private String name;
    private int level;
    private int health;
    private int maxHealth;

    public GameCharacter(String name, int level, int maxHealth) {
        this.name = name;
        if (level < 1 || level > 100) {
            System.out.println("Warning: Invalid level for " + name + ". Setting to 1.");
            this.level = 1;
        } else {
            this.level = level;
        }

        if (maxHealth < 1) {
            System.out.println("Warning: Invalid maxHealth for " + name + ". Setting to 100.");
            this.maxHealth = 100;
        } else {
            this.maxHealth = maxHealth;
        }

        this.health = this.maxHealth;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int takeDamage(int damage) {
        if (!isAlive() || damage <= 0) {
            return 0;
        }
        int actualDamage = Math.min(health, damage);
        health -= actualDamage;
        return actualDamage;
    }

    public int restoreHealth(int amount) {
        if (!isAlive() || amount <= 0) {
            return 0;
        }
        int actualRestored = Math.min(maxHealth - health, amount);
        health += actualRestored;
        return actualRestored;
    }

    public abstract String getCharacterInfo();

    public abstract int calculatePower();
}
