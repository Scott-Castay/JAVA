package com.scott.inheritanceandinterfaces;

public class Human extends Race{
	protected int strength;
	protected int dexterity;
	protected int intelligence;
	protected int health;
	
	public Human() {
		super();
	}

	public void attack(Human target) {
		target.health -= this.strength;
		System.out.println("Dealt" + this.strength +"damage.");
	}
	
	public void rest() {
		System.out.println("Resting...");
		this.health +=10;
		
	public void eat() {
		System.out.println("Eat some pizza!");
		this.health += 40;
	}
}
