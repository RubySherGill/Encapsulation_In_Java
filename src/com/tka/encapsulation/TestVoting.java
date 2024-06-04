package com.tka.encapsulation;

public class TestVoting {
	public static void main(String[] args) {
		Voting voting = new Voting();
		voting.setName("Myrub");
	    System.out.println("Name : "+voting.getName());
	
		voting.setAge(12);
		System.out.println("Age : "+voting.getAge());
		
	}

}
