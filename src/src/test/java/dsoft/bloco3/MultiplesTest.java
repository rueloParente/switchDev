package dsoft.bloco3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesTest {
    //Exercise 2 - number of multiples of given number in given interval
    @Test
    void shouldReturnNumberOfMultiples() {
        //Arrange
        int expected = 2;
        //Act
        int result = Multiples.numberMultiplesInRange(2, 2, 4);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldBeAbleToReturnMultiplesOfZero() {
        //Arrange
        int expected = 4;
        //Act
        int result = Multiples.numberMultiplesInRange(0, 0, 3);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnZeroIfNoMultiples() {
        //Arrange
        int expected = 0;
        //Act
        int result = Multiples.numberMultiplesInRange(3, 1, 2);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldAllowForNegativeRange(){
        //Arrange
        int expected = 3;
        //Act
        int result = Multiples.numberMultiplesInRange(2, -2, 2);
        //Assert
        assertEquals(expected, result);
    }

    @Test
    void shouldReturnZeroIfRangeIsInverted(){
        //Arrange
        int expected = 0;
        //Act
        int result = Multiples.numberMultiplesInRange(2, 2, 1);
        //Assert
        assertEquals(expected, result);
    }
    //Exercise 3 - number of multiples of two numbers
    @Test
    void shouldReturnNumberOfMultiplesOfTwoNumbers() {
        //Arrange
        int expected = 1;
        //Act
        int result = Multiples.numberMultiplesOfTwoNumbers(2, 3, 2, 6);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnZeroIfNoCommonMultiples() {
        //Arrange
        int expected = 0;
        //Act
        int result = Multiples.numberMultiplesOfTwoNumbers(2, 3, 2, 4);
        //Assert
        assertEquals(expected, result);
    }
    // Exercise 4 - Sum of multiples of two numbers
    @Test
    void shouldReturnSumOfMultiplesOfTwoNumbers() {
        //Arrange
        int expected = 6;
        //Act
        int result = Multiples.sumMultiplesOfTwoNumbers(2, 3, 2, 6);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnZeroIfNoMultiplesToSum() {
        //Arrange
        int expected = 0;
        //Act
        int result = Multiples.sumMultiplesOfTwoNumbers(2, 3, 2, 4);
        //Assert
        assertEquals(expected, result);
    }

}