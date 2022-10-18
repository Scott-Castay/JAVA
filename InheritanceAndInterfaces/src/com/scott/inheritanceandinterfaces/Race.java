package com.scott.inheritanceandinterfaces;

public abstract class Race implements LivingThing{
	protected int strength;
	protected int dexterity;
	protected int intelligence;
	protected int health;
	
	public Race() {
		this.strength = 10;
		this.dexterity = 10;
		this.intelligence = 10;
		this.health = 100;
	}
	 public abstract void rest();
	 
	 public abstract void eat();
	 
}
