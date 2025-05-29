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

    // Method to validate mobile number USE CASE-04
    public static boolean validateMobileNumber(String mobileNumber) {
        // Mobile number must start with country code (at least 2 digits), followed by space and 10-digit number
        // Example: 91 9876543210
        return mobileNumber.matches("^[0-9]{2,}\\s[0-9]{10}");
    }

    // Method to validate password as per Rule-1 USE CASE-05
    public static boolean validateRuleOne(String passwordRuleOne) {
        // Password must have at least 8 characters and no whitespace
        return passwordRuleOne.matches("^[^\\s]{8,}");
    }

    // Method to validate password as per Rule-2 USE CASE-06
    public static boolean validateRuleTwo(String passwordRuleTwo) {
        // Password must have at least 8 characters, no whitespace, and at least one uppercase letter
        return passwordRuleTwo.matches("^(?=.*[A-Z])[^\\s]{8,}$");
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

        // Take phone number form the user  UseCase 04
        System.out.println("Enter mobile number");
        String mobileNUmber=scanner.nextLine();
        System.out.println("Mobile Number validate "+validateMobileNumber(mobileNUmber));

        // Taking the password from the user  UseCase 05
        System.out.println("Enter password");
        String passwordRuleOne=scanner.nextLine();
        System.out.println("Password validate "+validateRuleOne(passwordRuleOne));

        // Taking the password from the user  UseCase 06
        System.out.println("Enter password");
        String passwordRuleTwo=scanner.nextLine();
        System.out.println("Password validate "+validateRuleTwo(passwordRuleTwo));

    }
}
