package com.scottcastay.zookeeper;

public class Bat extends Mammal{
	
	public Bat() {
		this.setEnergyLevel(200);
	}
	
	public void fly() {
		System.out.println("Flying Bat!");
		this.setEnergyLevel(-50);
	}
	
	public void eatHumans() {
		System.out.println("Bat eats human!");
		this.setEnergyLevel(25);
	}
	
	public void attackTown() {
		System.out.println("Burning!");
		this.setEnergyLevel(-100);
	}

}
