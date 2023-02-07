package com.learn;

import java.util.HashMap;

public class MapExxample {

	public static void main(String[] args) {

		HashMap<String, Integer> courses=new HashMap<>();
		//adding elements
		courses.put("Core Java", 4000);
		courses.put("Basic Python", 3500);
		courses.put("Spring", 8000);
		courses.put("android", 4000);
		courses.put("android", 6000);
		
		System.out.println(courses);
		
//		courses.forEach((e1,e2)->{
//			System.out.println(e1+"=>"+e2);
//		});
		
		courses.forEach((key,value)->{
			System.out.print(key);
			System.out.print("=>");
			System.out.println(value);
		});
		
		System.out.println(courses.get("Core Java"));
		
	}

}
