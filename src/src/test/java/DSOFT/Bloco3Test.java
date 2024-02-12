package DSOFT;

import DSOFT.Bloco3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco3Test {
    //Exercise 1 - calculating the factorial
    @Test
    void shouldReturnSixWhenNumberIsThree() {
        //Arrange
        int expected = 6;
        //Act
        long result = Bloco3.numberFactorial(3);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnOneWhenNumberIsZero() {
        //Arrange
        int expected = 1;
        //Act
        long result = Bloco3.numberFactorial(0);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnNegativeOneWhenNumberIsNegative() {
        //Arrange
        int expected = -1;
        //Act
        long result = Bloco3.numberFactorial(-5);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnNegativeTwoWhenNumberIsGreaterThanTwenty() {
        //Arrange
        int expected = -2;
        //Act
        long result = Bloco3.numberFactorial(21);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnFactorialOfTwenty() {
        //Arrange
        long expected = 2432902008176640000L;
        //Act
        long result = Bloco3.numberFactorial(20);
        //Assert
        assertEquals(expected, result);
    }
}