package parametrized_tests;

import parametrized_tests.UserValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"", "  ", "harry potter4", "l4", "ron!", "Karaś24"})
    public void shouldReturnFalseWhenTheUsernameIsIncorrect(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Sportowiec98", "fan_Rammsteina85", "Jon.Snow", "Mother-of-dragons-4"})
    public void shouldReturnTrueWhenTheUsernameIsCorrect(String username) {
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Michał.Kowalski90@gmail.com", "Julia.Roberts2!@gmail.com", "Misiek@gmailcom", "HarryPotter99gmail.com", "Hermiona_Granger@gmail", "student18@uwr.edu.uniwersytet"})
    public void shouldReturnFalseWhenTheEmailIsIncorrect(String email) {
        assertFalse(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Daenerys_Stormborn00@gmail.com", "jan.kowalski60@onet.pl", "Michal.kowal90@gmail.com", "student_psychologii3@uwr.edu.pl"})
    public void shouldReturnTrueWhenTheEmailIsCorrect(String email) {
        assertTrue(validator.validateEmail(email));
    }
}