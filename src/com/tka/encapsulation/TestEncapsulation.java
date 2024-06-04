package com.tka.encapsulation;

import com.tka.utility.ObjectValidation;

public class TestEncapsulation {
	public static void main(String[] args) {
		Student student = new Student();
		student.setRollNo(-11);
		student.setName("My");
		
	    //System.out.println(student.getRoll_no());
		//System.out.println(student.getName());
		
//		boolean isDataValid = ObjectValidation.studentValidation(student);
//		if(isDataValid) {
//			System.out.println(student);
//		}
//		else {
//			System.out.println("Invalid Data");
//		}
		
		String msg = ObjectValidation.studentValidation2(student);
		if(msg.equals("")) {
			System.out.println(student);
		}
		else {
			System.out.println(msg);
		}
		
	}

}
