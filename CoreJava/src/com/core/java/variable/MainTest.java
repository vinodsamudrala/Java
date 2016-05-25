package com.core.java.variable;

public class MainTest {
	
	public static void main(String[] args) {
		
		int areaPerimeter = addAreaPerimeter(10,15);
		
		System.out.println("Area :" + areaPerimeter);
	}
	
	static int x;
	
	static int addAreaPerimeter(int l, int b){
		
		int area = calArea(l, b);
		
		int perimeter = calPerimeter(l, b);
		
		return area+perimeter;
	}
	static int calArea(int l, int b) {
		return l * b;
	}
	static int calPerimeter(int l, int b){
		return 2*(l+b);
		
	}
	

}
