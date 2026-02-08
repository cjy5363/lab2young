package monsters;

/**
 * Project: Lab 2 Monsters
 * File: Monster.java
 * Author: Your Name
 * Description: Abstract parent class representing all monsters.
 */
public abstract class Monster {

    private String name;
    private SizeType sizeType;

    // Added fields for assignment
    private int health;
    private int level;
    private SpecialPower specialPower;

    public Monster(String name, SizeType sizeType) {
        this.name = name;
        this.sizeType = sizeType;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public SizeType getSizeType() {
        return sizeType;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public SpecialPower getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(SpecialPower specialPower) {
        this.specialPower = specialPower;
    }

    public abstract void specialPowers();
}
