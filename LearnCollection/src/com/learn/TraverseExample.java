package com.learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {

	public static void main(String[] args) {

		ArrayList<String> names=new ArrayList<String>();
		names.add("Durgesh");
		names.add("Vivek");
		names.add("Vishal");
		names.add("Ashutosh");
		names.add("ABC");
		
		//for each loop
		for(String str:names)
		{
			System.out.print(str +"\t"+str.length()+"\t");
			StringBuffer br=new StringBuffer(str);
			System.out.println(br.reverse());
		}
		System.out.println("_____________________________________________");
		
		//traversing using iterator
		Iterator<String> itr =names.iterator();
		
		while(itr.hasNext())
		{
			String next = itr.next();
			System.out.println(next);
		}
		//backword traversal of collection Listiterator
		ListIterator<String> litr=names.listIterator(names.size());
		while(litr.hasPrevious()) {
			String previous = litr.previous();
			System.out.println(previous);
		}
		  System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		//for each method
		names.forEach(e->{
			System.out.println(e);
		});
		System.out.println("srting of elements");
		TreeSet<String> set = new TreeSet<>();
		set.addAll(names);
		set.forEach(e->{
			System.out.println(e);
		});
	}

}
