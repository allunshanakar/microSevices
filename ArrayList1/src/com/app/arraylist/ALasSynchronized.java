package com.app.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ALasSynchronized {
	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();
		al.add("viswa");
		al.add("madhu");
		al.add("ravi");
		al.add("shannu");
		al.add("Raju");
		al.add("sree");
		System.out.println(al);

		/*
		 * al=Collections.synchronizedList(al);
		 * 
		 * synchronized (al) { Iterator<String> iterator=al.iterator();
		 * while(iterator.hasNext()) { System.out.println(iterator.next()); } }
		 */
		for (String string : al) {
			System.out.println(string);
		}
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		itr.remove();
		
		
		List<String> al1=Arrays.asList("anna","akka","nanna","amma");
		System.out.println(al1);
		
		StringBuffer bff=new StringBuffer();
		for(String s:al1) {
			bff.append(s).append(";");
			
		}
		String finalString=bff.toString();
		System.out.println(finalString);
		
		System.out.println(al.subList(1,3));
		
	}
}
