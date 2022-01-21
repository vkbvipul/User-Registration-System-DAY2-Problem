package com.techstack.userreg.main;

public class UserRegMain {

	public static void main(String[] args) {
		// User Registration System needs to ensure all validations are in place during the User Entry
		String firstName = "Abcde";
		int length = firstName.length();
		if(length < 3) {
			System.out.println("Name length is shorter than 3 chars.");
			return;
		}
		else if (!Character.isUpperCase(firstName.charAt(0)))
		{
			System.out.println("First character is not UPPERCASE.");
			return;
		}
		System.out.println("Name is correct !!, UC 1 passed.");
	}

}
