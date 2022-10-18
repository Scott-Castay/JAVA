package com.scott.inheritanceandinterfaces;

public class Rogue extends Human {

	public Rogue() {
		super();
		this.dexterity = 20;
		// TODO Auto-generated constructor stub
	}
	
	public void attack(Human target) {
		target.health -= this.dexterity;
	}

}
