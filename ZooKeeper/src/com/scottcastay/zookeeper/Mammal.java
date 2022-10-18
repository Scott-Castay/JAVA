package com.scottcastay.zookeeper;

public class Mammal {
	
	protected int energyLevel = 100;
	// if private then it is unacccesible, needs to be protected

	public int getEnergyLevel() {
		System.out.println("Level: " + energy);
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel += energyLevel;
	}
		

}
