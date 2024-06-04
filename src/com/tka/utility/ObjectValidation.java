package com.tka.utility;

import com.tka.encapsulation.Student;

public class ObjectValidation {
//	public static boolean studentValidation(Student student) {
//		boolean isDataValid = true;
//		if (student.getRollNo() <= 0) {
//			isDataValid = false;
//		}
//		if (student.getName() == null || student.getName().length() < 3) {
//			isDataValid = false;
//		}
//		return isDataValid;
//	}
	
	public static String studentValidation2(Student student) {
		String msg ="";
		if(student.getRollNo()<=0) {
			msg=msg+"Invalid Roll No.\n";
		}
		if(student.getName()==null || student.getName().length()<3) {
			msg=msg+"Invalid Name";
		}
		
		return msg;
		
	}

}
