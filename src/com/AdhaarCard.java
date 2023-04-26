package com;

public class AdhaarCard {
	public static AdhaarCard a;

	private AdhaarCard() {
		System.out.println("Object created");

	}

	public static void createObject() {
		if (a == null)
			a = new AdhaarCard();
		else
			System.out.println("Object not created");
	}
}
