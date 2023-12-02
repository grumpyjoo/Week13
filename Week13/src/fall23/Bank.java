package fall23;

import java.util.*;

interface customer {
	/*
	 * Student Name: Rachelle Muyargas 
	 * Student ID: 4533324 
	 * Professor: Sumithra Chandrasekar
	 * 
	 * Topic: Interface
	 * 
	 */
	public void credentials(String Username, String Password);

	public void IFSC(); // get user input
}

public class Bank implements customer {
	public void credentials(String Username, String Password) {
		System.out.println("username: " + Username);
		System.out.println("password: " + Password);
	}

	public void IFSC() {
		System.out.println("Bank name is RBC");
	}

	public static void main(String[] args) {
		Bank z = new Bank();
		z.credentials("moonshinea", "L4vandeerx*");

		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter IFSC code: ");
		String code = sc.nextLine();
		z.IFSC();
	}
}
