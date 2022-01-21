package com.techstack.userreg.main;
public class UserRegMain {
	public static void main(String[] args) {
		// User Registration System needs to ensure all validations are in place during the User Entry
		String firstName = "Sdde";
		String lastName = "DDde";
		String email = "abc.xyz@bl.co.in";
		
		//UC1
		if(checkLengthAndFirstChar(firstName,firstName.length()))
		 System.out.println("FirstName should be of more than 3 chars and should have first char uppercase.");
		//UC2
		if(checkLengthAndFirstChar(lastName,lastName.length()))
		 System.out.println("LastName should be of more than 3 chars and should have first char uppercase.");
		//UC3
		if(!checkValidityOfEmail(email))
			System.out.println("Email is not correct ! UC3");
	}

	private static boolean checkValidityOfEmail(String email) {
		String regex = "^[A-Za-z0-9+_.-]+@bl.co(.+)$";
		if(email.matches(regex))
			return true;
		return false;
	}

	private static boolean checkLengthAndFirstChar(String firstName, int length) {
		if((length < 3)||(!Character.isUpperCase(firstName.charAt(0))))
			return true;
		return false;
	}

}
