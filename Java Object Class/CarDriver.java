package com.jsp.objectclass;

public class CarDriver {

	public static void main(String[] args) {
		Car c1 = new Car("KIA", "EV6", 600000, "Red");
		Car c2 = new Car("KIA", "EV6", 600000, "Red");

		System.out.println(c1);// By toString's helps

		// calling toSting()
		System.out.println(c1.toString());

		// calling equals()
		System.out.println(c1.equals(c2));// up-casting : passing c2 to object (Object obj)
		System.out.println(c1 == c2); // comparing address

		// calling hashCode()
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());

	}

}