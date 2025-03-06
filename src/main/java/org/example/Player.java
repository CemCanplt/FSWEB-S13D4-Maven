package org.example;

public class Player {
    // Değişkenler
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    // Constructor
    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }

    // HealthRemaining metodu
    public int healthRemaining() {
        return healthPercentage;
    }

    // LoseHealth metodu
    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage < 0) {
            System.out.println(name + " player has been knocked out of game");
            healthPercentage = 0;
        }
    }

    // RestoreHealth metodu
    public void restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;
        if (healthPercentage > 100) {
            healthPercentage = 100;
        }
    }
}
