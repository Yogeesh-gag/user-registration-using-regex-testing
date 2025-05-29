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



}
