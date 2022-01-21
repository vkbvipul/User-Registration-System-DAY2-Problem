package com.techstack.userreg.main;

public class UserRegMain {

	public static void main(String[] args) {
		// User Registration System needs to ensure all validations are in place during the User Entry
		String firstName = "Sdde";
		String lastName = "dde";
		
		//UC1
		if(checkLengthAndFirstChar(firstName,firstName.length()))
		 System.out.println("FirstName should be of more than 3 chars and should have first char uppercase.");
		else
		 System.out.println("FirstName is correct !!, UC 1 passed.");
		
		//UC2
		if(checkLengthAndFirstChar(lastName,lastName.length()))
		 System.out.println("LastName should be of more than 3 chars and should have first char uppercase.");
		else
		 System.out.println("LastName is correct !!, UC 1 passed.");
	}

	private static boolean checkLengthAndFirstChar(String firstName, int length) {
		if((length < 3)||(!Character.isUpperCase(firstName.charAt(0))))
			return true;
		return false;
	}

}
