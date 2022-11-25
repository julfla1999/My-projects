package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> providePersonForCalculatingBmi() {
        return Stream.of(
                Arguments.of(new Person(1.71,58), "Normal (healthy weight)"),
                Arguments.of(new Person(1.80, 120), "Obese Class II (Severely obese)" ),
                Arguments.of(new Person(1.58, 38), "Severely underweight"),
                Arguments.of(new Person(1.76, 140), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.64, 70), "Overweight"),
                Arguments.of(new Person(1.90, 65), "Underweight")
        );
    }
}
