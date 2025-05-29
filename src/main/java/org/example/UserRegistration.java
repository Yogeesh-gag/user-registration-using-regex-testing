package org.example;

import java.util.Scanner;

public class UserRegistration {

    // Method to validate the first name -USE CASE-01
    public static boolean validateFirstName(String firstName) {
        // First name must start with a capital letter and have at least 3 letters
        return firstName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    // Method to validate the second name (last name) USE CASE-02
    public static boolean validateSecondName(String secondName) {
        // Same rule: must start with a capital and have at least 3 letters
        return secondName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    // Method to validate an email address USE CASE-03
    public static boolean validateEmail(String email) {
        // Email should follow standard format: characters, optional special chars, @, domain, and extension
        return email.matches("^[a-zA-Z0-9]+([._+-]+[a-zA-Z0-9])?@[a-zA-Z0-9]+[a-zA-Z0-9]+\\.[a-z]{2,4}(\\.[a-z]{2,})?$");

        // Alternate patterns for more flexibility can be used if needed (commented for reference)
        // return email.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$");
        // return email.matches("^[a-zA-Z0-9]+([._%+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+$");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Create scanner object to take user input

        // --- Uncomment these lines if you want to take name inputs too ---
        //Taking the user first name from the user UseCase 01
        System.out.println("Enter First Name");
        String firstName = scanner.nextLine();
        System.out.println("First name valid: " + validateFirstName(firstName));

        //Taking the user second name from the user UseCase 02
        System.out.println("Enter Second Name");
        String secondName = scanner.nextLine();
        System.out.println("Second name valid: " + validateSecondName(secondName));

        // Take email input from user for email validation  UseCase 03
        System.out.println("Enter email");
        String email = scanner.nextLine();
        System.out.println("Email valid: " + validateEmail(email));
    }
}
