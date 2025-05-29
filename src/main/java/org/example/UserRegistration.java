package org.example;

import java.util.Scanner;

public class UserRegistration {

    // Method to validate the first name -USE CASE-01
    public static boolean validateFirstName(String firstName) {
        // First name must start with a capital letter and have at least 3 letters
        return firstName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Create scanner object to take user input

        // --- Uncomment these lines if you want to take name inputs too ---
        //Taking the user first name from the user UseCase 01
        System.out.println("Enter First Name");
        String firstName = scanner.nextLine();
        System.out.println("First name valid: " + validateFirstName(firstName));
    }
}
