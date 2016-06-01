package com.core.java.overloading;

public class OverLoadingTest2 {

	public int sqrt(int i) {
		return i + i;
	}

	public void method(String name, int... i) { // var args [10]

		/*
		 * for(int index=0 ; index < i.length ; index++){
		 * System.out.println(i[index]); }
		 */

		System.out.println("Name :" + name);

		for (int a : i) {
			System.out.print(a + " ");
		}
	}
	
	public void method(int count, int... i  ) { // var args [10]
		System.out.println("Count :" + count);
		for (int a : i) {
			System.out.print(a + " ");
		}
	}
	public long sqrt(long i) {
		System.out.println("Inside Long :");
		return i * i;
	}
	public static void main(String[] args) {

		OverLoadingTest2 ol2 = new OverLoadingTest2();
		// System.out.println(ol2.sqrt(10L));
		// ol2.method(10);
		//ol2.method("Rakesh", 20, 30, 40, 50, 60);
		ol2.method(20,10);
		
				
		int a[] = {10,20,50,50,60,46,78,98,52,12};
				
		int midleIndex = a.length/2;
		
		
		int intVal = 2147483647+1;
		
		long lVal = 2147483648L;
		
		long lval2 = intVal;
		
		long lval3 = 200;
		
		intVal = (int)lval3;
		
		intVal = (int)lVal;
		
		intVal = Integer.MAX_VALUE + 1; //2147483647+1;
		
		System.out.println(intVal);
	
		
		
		//System.out.println("Middle 1 :"+ a[midleIndex-1]);
		
		//System.out.println("Middle 2 :"+ a[midleIndex ]);
		
		
	}
}
