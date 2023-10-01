package com.jsp.objectclass;

import java.util.Objects;

public class Car {

	String brand;
	String name;
	double price;
	String colour;

	public Car(String b, String n, double p, String c) {
		this.brand = b;
		this.name = n;
		this.price = p;
		this.colour = c;
	}

	// overriding toString method : to get the states
	@Override
	public String toString() {
		return "[" + brand + "," + name + "," + price + "," + colour + "]";
	}

	// overriding equals method : to compare by states
	@Override
	public boolean equals(Object obj) {
		Car c = (Car) obj; // down-casting
		if (this.brand == c.brand && this.name == c.name && this.price == c.price && this.colour == c.colour) {
			return true;
		} else {
			return false;
		}
	}

	// overriding hashCode method : generates hashCode by comparing states
	@Override
	public int hashCode() {
		return Objects.hash(brand, name, price, colour);
		//// hashCode and equals go hand in hand
		// variables which we are checking in the equals methods should only be passed

	}

}