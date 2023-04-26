package com;

public class PrimeMinister {

	public static PrimeMinister p;

	private PrimeMinister() {
		System.out.println("Object created");
	}

	public static void createObject() {

		if (p == null)
			p = new PrimeMinister();
		else
			System.out.println("Object not created");

	}
}
