package com.scott.inheritanceandinterfaces;

public class Orc extends Race {
	protected int strength;
	protected int dexterity;
	protected int intelligence;
	protected int health;
	
	public Orc() {
		super();
		this.strength = 20;
		this.intelligence = 5;
		this.health = 150;
	}
	
	public void rest() {
		System.out.println("Resting...");
		this.health += 50;
	}
	
	public void eat() {
		System.out.println("Eat some boar!");
		this.health += 50;
	}
}
