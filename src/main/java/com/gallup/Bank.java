package com.gallup;

import java.util.Scanner;

public class Bank {
	private static Scanner scanner;

	public static void main(final String[] args) {
		int password = 1234;
		int passwordGuess = 0;
		int currSelection = 0;
		double requestedMoney = 0.00;
		double balance = 10.00;
		boolean exitProgram = true;
		scanner = new Scanner(System.in);
		while (password != passwordGuess) {
			System.out.println("What is your password?");
			passwordGuess = scanner.nextInt();
			if (passwordGuess == password) {
				System.out.println("correct password");
			} else {
				System.out.println("Incorrect password, please try again");
			}
			while (exitProgram) {
				System.out.println("Thank you for banking with Cameron Hickey Banking.");
				System.out.println("Press 1 to withdraw");
				System.out.println("Press 2 to add a Deposit");
				System.out.println("Press 3 to check your balance");
				System.out.println("Press 4 to open a CD");
				System.out.println("Press 5 to exit your account and sign in as a different user");
				currSelection = scanner.nextInt();
				if (currSelection == 1) {
					System.out.println("How much money would you like to withdraw?");
					requestedMoney = scanner.nextDouble();

					if (requestedMoney > balance) {
						System.out.println("I am sorry, but you do not have the funds to make that withdrawl");
					}

					if (requestedMoney < balance) {
						System.out.println("You have withdrawn $" + Double.toString(requestedMoney)
						        + "0 dollars from your account");
						balance = balance - requestedMoney;
						System.out.println("Your current balance is $" + Double.toString(balance) + "0");
					}
				}

				if (currSelection == 2) {
					System.out.println("How much money would you like to Deposit?");
					requestedMoney = scanner.nextDouble();
					balance = balance + requestedMoney;
					System.out.println("You current balance is $" + Double.toString(balance) + "0");
				}

				if (currSelection == 3) {
					System.out.println("Unforunately, CDs are not available yet");
				}

				if (currSelection == 4) {
					System.out.println("Your current Balance is $" + Double.toString(balance) + "0");
				}

				if (currSelection == 5) {
					exitProgram = false;
					System.out.println("Thank you for banking with Cameron Hickey Banking and have a nice day!");
				}
			}

		}
	}
}
