package dsoft.bloco3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {
    @Test
    void shouldReturnSumEvenNumbersInRange() {
        //Arrange
        int expected = 6;
        //Act
        int result = EvenOdd.sumEvenNumbersInRange(1, 5);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnZeroIfNoEvenNumbersInRange() {
        //Arrange
        int expected = 0;
        //Act
        int result = EvenOdd.sumEvenNumbersInRange(3, 3);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnSumOddNumbersInRange() {
        //Arrange
        int expected = 3;
        //Act
        int result = EvenOdd.sumOddNumbersInRange(1, 5);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnZeroIfNoOddNumbersInRange() {
        //Arrange
        int expected = 0;
        //Act
        int result = EvenOdd.sumOddNumbersInRange(4, 4);
        //Assert
        assertEquals(expected, result);
    }
    //The product of all multiples of a given number in a given interval.
    @Test
    void shouldReturnProductOfMultiples() {
        //Arrange
        int expected = 8;
        //Act
        int result = EvenOdd.productOfMultiples(2, 1, 5);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnZeroIfNoMultiplesInRange() {
        //Arrange
        int expected = 0;
        //Act
        int result = EvenOdd.productOfMultiples(2, 3, 3);
        //Assert
        assertEquals(expected, result);
    }
    //The average of the multiples of a given number in an interval defined by two numbers.
    @Test
    void shouldReturnAverageMultiplesGivenNumber() {
        //Arrange
        double expected = 3.0;
        //Act
        double result = EvenOdd.averageMultiplesGivenNumber(2, 1, 5);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnNaNIfNoMultiplesInRange() {
        //Arrange
        double expected = Double.NaN;
        //Act
        double result = EvenOdd.averageMultiplesGivenNumber(2, 3, 3);
        //Assert
        assertEquals(expected, result);
    }
}