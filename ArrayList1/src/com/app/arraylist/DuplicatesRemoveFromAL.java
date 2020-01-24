package com.app.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class DuplicatesRemoveFromAL {

	public static void main(String[] args) {
		
		  ArrayList<Integer> al=new ArrayList<>();
		 		al.add(2);
		 		al.add(3);
		 		al.add(3);
		 		al.add(5);
		 		al.add(10);
		 		al.add(10);
		 		al.add(223);
		 		System.out.println(al);
		 		
		  HashSet<Integer> withOutDuplicates=new HashSet<>(al);
		  System.out.println(withOutDuplicates);
		  
		  al.clear();
		  System.out.println(al);
		  
		  al.addAll(withOutDuplicates);
		  System.out.println(al);
		  
		  Collections.reverse(al);
		  System.out.println(al);
		  
		  al.remove(1);
		 System.out.println(al);
		 
		
	}

}
