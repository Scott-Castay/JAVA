package com.scott.inheritanceandinterfaces;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello There")
		
		Human h1 = new Human();
		Human h2 = new Human();
		
		System.out.println("Human1's health is:" + h1.health);
		System.out.println("Human2's health is:" + h2.health);
		h1.attack(h2);
		System.out.println("Human1's health is:" + h1.health);
		System.out.println("Human2's health is:" + h2.health);
	}

}
