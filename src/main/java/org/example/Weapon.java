package org.example;

public enum Weapon {
    SWORD(10, 1.2),
    AXE(15, 1.0),
    BOW(8, 1.5),
    DAGGER(5, 1.8);

    private final int damage;
    private final double attackSpeed;

    // Constructor
    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    // Getter for damage
    public int getDamage() {
        return damage;
    }

    // Getter for attack speed
    public double getAttackSpeed() {
        return attackSpeed;
    }
}
