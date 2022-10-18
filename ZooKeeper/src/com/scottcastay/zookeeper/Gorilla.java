package com.scottcastay.zookeeper;

public class Gorilla extends Mammal{

	public void throwStuff() {
		this.setEnergyLevel(-5);
		System.out.println("Gorilla Throw!");
		}
		
	public void eat() {
		this.setEnergyLevel(10);
		System.out.println("Gorilla Eat!");
		}
		
	public void climb() {
		this.setEnergyLevel(-10);
		System.out.println("Gorilla Climb!");
		}
}
