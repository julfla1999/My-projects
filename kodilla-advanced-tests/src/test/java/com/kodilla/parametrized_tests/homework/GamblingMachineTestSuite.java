package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachine.csv", numLinesToSkip = 1)
    public void shouldCountHowManyWins(String userNumbers) {
        Set<Integer> result = getNumbers(userNumbers);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(result));
    }

   private Set<Integer> getNumbers(String data) {
       String[] strings = data.split(";");
       Set<Integer> userNumbers = new HashSet<>();
       for ( String number : strings ) {
           Integer result = Integer.valueOf(number);
           userNumbers.add(result);
       }
       return userNumbers;
    }

}