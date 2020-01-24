package com.app.arraylist;

import java.util.ArrayList;

public class ALEmployee {

	public static void main(String[] args) {
		Employee e=new Employee(1,"shannu",222.3,2019);
		//System.out.println(e);
		ArrayList<Employee> emplist=new ArrayList<>();
		emplist.add(e);
		emplist.add(new Employee(1,"viswa",3333.3,2011));
		emplist.add(new Employee(1,"ravi",2323.3,1999));
		emplist.add(new Employee(1,"madhu",5555.3,2014));

		for(Employee empobj:emplist) {
			System.out.println(empobj);
			Double year=empobj.getJd();
			ArrayList<Employee> newList=new ArrayList<Employee>();

			if(year<2005) {
				newList.add(empobj);
			
			}
			System.out.println(newList);
		}
	}
}
