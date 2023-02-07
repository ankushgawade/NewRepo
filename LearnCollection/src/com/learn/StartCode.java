package com.learn;

import java.util.*;

public class StartCode {
     
	public static void main(String[] args) {
		System.out.println("welcome to java collection framework");
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Durgesh");
		names.add("Vivek");
		names.add("Vishal");
		names.add("Ashutosh");
		names.add("Ashutosh");
		System.out.println(names);
		//get elements
//		System.out.println(names.get(0));
//		System.out.println(names.get(1));
		
		
//		LinkedList list = new LinkedList();
//		list.add("sachin");
//		list.add(101);
//		list.add(625.123);
//		list.add(true);
//		System.out.println(list);
		//remove element
//		names.remove("Durgesh");
//		System.out.println(names);
		
		//size
		System.out.println("Size="+names.size());
		System.out.println(names.contains("durgesh kumar"));
		//check empty
		System.out.println(names.isEmpty());
		//set value
//		names.set(4,"Ram");
		names.add(4, "shyam");
		System.out.println(names);
		
		//remove all elements
//		names.clear();
		System.out.println(names);

		
		Vector<String> vector=new Vector<>();
		vector.addAll(names);
		System.out.println("VECTOR -"+vector);
		
		System.out.println("__________________________________________________________");
		
		HashSet<Double> nms=new HashSet<>();
		nms.add(14.55);
		nms.add(34.12345);
		nms.add(new Double(234.233));
		nms.add(99.80);
		nms.add(99.80);
		nms.add(5.3);
		
		System.out.println(nms);
		
		
		TreeSet<Double> tset = new TreeSet<>();
		tset.addAll(nms);
		System.out.println(tset);
		

		
	}
}
