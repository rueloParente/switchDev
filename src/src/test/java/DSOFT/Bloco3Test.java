package DSOFT;

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
    //Exercise 2 - number of multiples of given number in given interval
    @Test
    void shouldReturnNumberOfMultiples() {
        //Arrange
        int expected = 2;
        //Act
        int result = Bloco3.numberMultiplesInRange(2, 2, 4);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldBeAbleToReturnMultiplesOfZero() {
        //Arrange
        int expected = 4;
        //Act
        int result = Bloco3.numberMultiplesInRange(0, 0, 3);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnZeroIfNoMultiples() {
        //Arrange
        int expected = 0;
        //Act
        int result = Bloco3.numberMultiplesInRange(3, 1, 2);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldAllowForNegativeRange(){
        //Arrange
        int expected = 3;
        //Act
        int result = Bloco3.numberMultiplesInRange(2, -2, 2);
        //Assert
        assertEquals(expected, result);
    }

    @Test
    void shouldReturnZeroIfRangeIsInverted(){
        //Arrange
        int expected = 0;
        //Act
        int result = Bloco3.numberMultiplesInRange(2, 2, 1);
        //Assert
        assertEquals(expected, result);
    }

}