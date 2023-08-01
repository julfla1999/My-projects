package parametrized_tests;

import parametrized_tests.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "parametrized_tests.PersonSources#providePersonForCalculatingBmi")
    public void shouldCalculatePersonsBmi(Person person, String expected) {
        assertEquals(expected, person.getBMI());
    }


}