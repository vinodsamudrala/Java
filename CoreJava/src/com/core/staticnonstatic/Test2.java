package com.core.staticnonstatic;

public class Test2 {
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		
		Test1 t2 = new Test1();
		
		t1.count ++; // 1
		
		t1.data++; // 1
		
		t1.name = "vinod";
		
		System.out.println("t1 count:"+ t1.count +" t1  data: "+t1.data + " name :" + t1.name);
		
		t2.count ++; // 2
		
		t2.data++; // 1
		
		t2.name = "Rakesh";
		
		System.out.println("t2 count:"+ t2.count +" t2  data: "+t2.data+ " name :" + t2.name);
	}

}
