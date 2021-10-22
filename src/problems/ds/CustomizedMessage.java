package problems.ds;

import java.util.Scanner;

public class CustomizedMessage {

	private static void check(String fname, String lname, String num) {
		if ((fname != null && lname != null) && (fname.matches("^[a-zA-Z]*$") && lname.matches("^[a-zA-Z]*$"))) {
			System.out
					.println("Hello " + fname + ", We've your Full Name as " + fname + " " + lname + " in our System.");
		}
		if (num.matches("\\d{2}-\\d{10}")) {
			System.out.println("Your Contact Number is " + num
					+ "Please, let us know in case of any clarification Thank you !!");
		} else {
			System.out.println("Number Didn't MAtch to the criteria");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Hello Sai, We've your Full Name as Sai Krishna in our System Your Contact Number is 91-8898765432 Please, let us know in case of any clarification Thank you !! ");

		System.out.println();
		System.out.println("ENter First Name");
		String fname = sc.next();
		System.out.println("Enter Last Name: ");
		String lname = sc.next();
		System.out.println("Enter Your Phone Number");
		String number = sc.next();

		check(fname, lname, number);
	}

}

