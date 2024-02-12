package dsoft.bloco3;

import dsoft.bloco3.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    //Exercise 1 - calculating the factorial
    @Test
    void shouldReturnSixWhenNumberIsThree() {
        //Arrange
        int expected = 6;
        //Act
        long result = Factorial.numberFactorial(3);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnOneWhenNumberIsZero() {
        //Arrange
        int expected = 1;
        //Act
        long result = Factorial.numberFactorial(0);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnNegativeOneWhenNumberIsNegative() {
        //Arrange
        int expected = -1;
        //Act
        long result = Factorial.numberFactorial(-5);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnNegativeTwoWhenNumberIsGreaterThanTwenty() {
        //Arrange
        int expected = -2;
        //Act
        long result = Factorial.numberFactorial(21);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnFactorialOfTwenty() {
        //Arrange
        long expected = 2432902008176640000L;
        //Act
        long result = Factorial.numberFactorial(20);
        //Assert
        assertEquals(expected, result);
    }
}