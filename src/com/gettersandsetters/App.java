package com.gettersandsetters;

class Person{

	String name;
	int age;
	
	void speak() {
		System.out.println("My name is: "+name);
	}
	
	int calculateYearsToRetirement() {
		int yearsLeft=65-age;
		return yearsLeft;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
	
}

public class App {

		
	
	public static void main(String[] args) {
		
		
		Person person1=new Person();
		
		person1.name="Usama";
		person1.age=35;
		
		
		int years=person1.calculateYearsToRetirement();
		System.out.println("Years still retirement: "+years);
		
		int age=person1.getAge();
		String name=person1.getName();
		
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);

	}

}
