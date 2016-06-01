package com.core.java.overloading;

public class OverLoadingTest {
	
	public void greetings(String name){
		System.out.println("Good Morning " + name);
	}
	
	public void greetings(String p1, String p2){
		System.out.println("Good Morning " + p1 + " & "+ p2);
	}
	
	public double sqrt(double d){
		
		System.out.println("Inside double "); 
		
		return d*d;
		
	}

	public int sqrt(int i){
		
		System.out.println("Inside int :"); 
		
		return i*i;
	}
	
	public int sqrt(int i, int j){
		
		System.out.println("Inside int :"); 
		
		return i*j;
	}
	
	public long sqrt(long i[]){
		
		System.out.println("Inside Long :"); 
		
		return i[0]*i[1];
	}
	
	public static void main(String[] args) {
		
		OverLoadingTest loadingTest = new OverLoadingTest();
		
		loadingTest.greetings("Rakesh");
		
		loadingTest.greetings("Rakesh","vinod");
		
		long l[] = {10,20};
		
		System.out.println(loadingTest.sqrt(l));
		
		//System.out.println(loadingTest.sqrt(10.5));
		
	}
}

