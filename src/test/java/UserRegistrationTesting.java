import org.example.UserRegistration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserRegistrationTesting {

    // UC1: First Name Validation
    @Test
    public void testValidFirstName() {
        boolean result = UserRegistration.validateFirstName("Yogeesh");
        System.out.println(result ? "PASS: 'Yogeesh' starts with capital letter and has more than 2 characters" : "FAIL: 'Yogeesh' should be valid but was not");
        assertTrue(result);
    }

    @Test
    public void testInvalidFirstName() {
        boolean result1 = UserRegistration.validateFirstName("yogi");
        System.out.println(!result1 ? "PASS: 'yogi' has less than 3 characters and is invalid" : "FAIL: 'yogi' should be invalid but was accepted");
        assertFalse(result1);

        boolean result2 = UserRegistration.validateFirstName("john");
        System.out.println(!result2 ? "PASS: 'yogi' does not start with a capital letter and is invalid" : "FAIL: 'yogi' should be invalid but was accepted");
        assertFalse(result2);
    }

    // UC2: Second Name Validation
    @Test
    public void testValidSecondName() {
        boolean result = UserRegistration.validateSecondName("Vinay");
        System.out.println(result ? "PASS: 'Vinay' starts with capital letter and has more than 2 characters" : "FAIL: 'Vinay' should be valid but was not");
        assertTrue(result);
    }
    @Test
    public void testInvalidSecondName() {
        boolean result = UserRegistration.validateSecondName("vi");
        System.out.println(!result ? "PASS: 'vi' has less than 3 characters and/or doesn't start with capital letter" : "FAIL: 'vi' should be invalid but was accepted");
        assertFalse(result);
    }

    // UC3: Email Validation
    @Test
    public void testValidEmail() {
        boolean result = UserRegistration.validateEmail("pavan.0628@gmail.com");
        System.out.println(result ? "PASS: Email format is correct" : "FAIL: Email should be valid but was not");
        assertTrue(result);
    }
    @Test
    public void testInvalidEmail() {
        boolean result = UserRegistration.validateEmail("pavan.0628@gmail");
        System.out.println(!result ? "PASS: Missing domain extension in email" : "FAIL: Email should be invalid but was accepted");
        assertFalse(result);
    }

    // UC4: Mobile Number Validation
    @Test
    public void testValidMobileNumber() {
        boolean result = UserRegistration.validateMobileNumber("91 9876543210");
        System.out.println(result ? "PASS: Valid country code, space, and 10-digit number" : "FAIL: Mobile number should be valid but was not");
        assertTrue(result);
    }
    @Test
    public void testInvalidMobileNumber() {
        boolean result = UserRegistration.validateMobileNumber("919876543210");
        System.out.println(!result ? "PASS: Missing space between country code and number" : "FAIL: Mobile number should be invalid but was accepted");
        assertFalse(result);
    }

    // UC5: Password Rule 1
    @Test
    public void testValidRuleOne() {
        boolean result = UserRegistration.validateRuleOne("password1");
        System.out.println(result ? "PASS: 8+ characters and no spaces" : "FAIL: Password should be valid but was not");
        assertTrue(result);
    }
    @Test
    public void testInvalidRuleOne() {
        boolean result = UserRegistration.validateRuleOne("pass");
        System.out.println(!result ? "PASS: Less than 8 characters" : "FAIL: Password should be invalid but was accepted");
        assertFalse(result);
    }

    // UC6: Password Rule 2
    @Test
    public void testValidRuleTwo() {
        boolean result = UserRegistration.validateRuleTwo("Password1");
        System.out.println(result ? "PASS: Has uppercase and 8+ characters with no spaces" : "FAIL: Password should be valid but was not");
        assertTrue(result);
    }
    @Test
    public void testInvalidRuleTwo() {
        boolean result = UserRegistration.validateRuleTwo("password1");
        System.out.println(!result ? "PASS: No uppercase letter present" : "FAIL: Password should be invalid but was accepted");
        assertFalse(result);
    }

}
