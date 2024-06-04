package com.tka.encapsulation;

public class Voting {
	private String name;
	private int age;
	
	public Voting() {
		// TODO Auto-generated constructor stub
	}

	public Voting(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		if(this.age>18) {
			System.out.println("Student are eligible for voting");
		}
		else {
			System.out.println("Students are not elgible for voting");
		}
	}
	
	
	

}
