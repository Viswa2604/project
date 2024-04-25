package model;

public class Pet {
    private String name;
    private String species;
    private int health;
    private int happiness;
    private int hunger;
    private int energy;

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
        this.health = 100;
        this.happiness = 100;
        this.hunger = 0;
        this.energy = 100;
    }

    public void feed() {
        hunger -= 10;
        if (hunger < 0) hunger = 0;
        energy += 5;
        if (energy > 100) energy = 100;
    }

    public void play() {
        happiness += 10;
        if (happiness > 100) happiness = 100;
        energy -= 10;
        if (energy < 0) energy = 0;
    }

    public void groom() {
        health += 5;
        if (health > 100) health = 100;
        happiness += 5;
        if (happiness > 100) happiness = 100;
    }

    public void sleep() {
        energy = 100;
    }

    // Getters and setters
}
