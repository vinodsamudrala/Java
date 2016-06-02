package com.core.java.overriding;

class Parent {
	
	int salary = 100;
	
	public void method1() {
		System.out.println("Inside Parent Mathod");
	}
	
	public void method2() {
		System.out.println("Inside Parent Method 2");
	}
}

class Child extends Parent {

	public void method1() {
	
		System.out.println("Inside Child Method");
	
	}
}

public class OverriddingTest {
	
	
	public static void main(String[] args) {
		
		Child chaild = new Child();
		
		
		System.out.println(chaild.salary); 
		
		chaild.method2();
		
		chaild.method1();
		
	}
	

}