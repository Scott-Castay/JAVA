package com.scott.inheritanceandinterfaces;

public class Elf extends Race {
	
	public Elf() {
		super();
		this.dexterity = 20;
		this.intelligence =20;
		this.health = 80;
		
	}

	public void attack(Race Target) {
		target.health -= this.strength;
		System.out.println("Dealt" + this.strength + "damage.");
	}
	
	public void rest() {
		System.out.println("Resting...");
		this.health += 10;
	}
	
	public void eat() {
		System.out.println("Eat some pizza!");
		
	}
}
