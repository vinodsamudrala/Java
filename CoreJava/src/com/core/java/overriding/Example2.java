package com.core.java.overriding;

class Vehicle {

	int noOfWheels = 4;

	public Vehicle() {

	}

	public Vehicle(int noOfWheels) {
		super();
		this.noOfWheels = noOfWheels;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

}

class Car extends Vehicle {

	// calls parent class 0 argment constructor
	String color = "red";

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

class Parent1 {

	protected Vehicle method1() {
		return new Vehicle(4);

	}
	
	private Vehicle method3() {
		return new Vehicle(4);

	}

	public final Vehicle method2() {  //final method we con't override.

		return new Vehicle(4);

	}
	
}

class Child1 extends Parent1 {

	public Car method1() {  // does't support in java 1.4.
							// co-variant return type.
		return new Car();
	}
	
	private Vehicle method3() { // not overridding bcuz private accessed within the class.
		return new Vehicle(4);

	}

}

public class Example2 {

}