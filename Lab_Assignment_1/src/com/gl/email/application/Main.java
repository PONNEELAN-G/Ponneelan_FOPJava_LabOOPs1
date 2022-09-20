package com.gl.email.application;

import java.util.Scanner;

import com.gl.email.model.Employee;
import com.gl.email.service.CredentialService;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee("Ponneelan","G");
		CredentialService cs = new CredentialService();
		String generatedEmail;
		String generatedPassword;
		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		switch(input) {
		case 1: {
			generatedEmail = cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "tech");
			generatedEmail = generatedEmail.toLowerCase();
			generatedPassword = cs.generatePassword();
			cs.showCredentials(emp, generatedEmail, generatedPassword);
			break;
		}
		case 2: {
			generatedEmail = cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "admin");
			generatedEmail = generatedEmail.toLowerCase();
			generatedPassword = cs.generatePassword();
			cs.showCredentials(emp, generatedEmail, generatedPassword);
			break;
		}
		case 3:{
			generatedEmail = cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "hr");
			generatedEmail = generatedEmail.toLowerCase();
			generatedPassword = cs.generatePassword();
			cs.showCredentials(emp, generatedEmail, generatedPassword);
			break;
		}
		case 4:{
			generatedEmail = cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "legal");
			generatedEmail = generatedEmail.toLowerCase();
			generatedPassword = cs.generatePassword();
			cs.showCredentials(emp, generatedEmail, generatedPassword);
			break;
		}

		}


	}

}
