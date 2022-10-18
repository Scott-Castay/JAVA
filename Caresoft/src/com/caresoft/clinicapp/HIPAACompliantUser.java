package com.caresoft.clinicapp;

public class HIPAACompliantUser {
	abstract boolean assignPin(int pin);
	abstract boolean accessAuthorized(Integer confirmedAuthID);
}
