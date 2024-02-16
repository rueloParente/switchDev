package dsoft.bloco3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitsTest {
    @Test
    void shouldReturnNumberToArrayDigits() {
        //Arrange
        int[] expected = {1, 2, 3, 4, 5};
        //Act
        int[] result = Digits.numberToArrayDigits(12345);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    void shouldReturnNumberToArrayDigitsNegative() {
        //Arrange
        int[] expected = {1, 2, 3, 4, 5};
        //Act
        int[] result = Digits.numberToArrayDigits(-12345);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    void shouldReturnNumberToArrayDigitsZero() {
        //Arrange
        int[] expected = {0};
        //Act
        int[] result = Digits.numberToArrayDigits(0);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    void shouldReturnNumberDigits() {
        //Arrange
        int expected = 5;
        //Act
        int result = Digits.numberDigits(12345);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnNumberDigitsNegative() {
        //Arrange
        int expected = 5;
        //Act
        int result = Digits.numberDigits(-12345);
        //Assert
        assertEquals(expected, result);
    }
    //The number of even digits in a integer
    @Test
    void shouldReturnNumberEvenDigits() {
        //Arrange
        int expected = 2;
        //Act
        int result = Digits.numberEvenDigits(12345);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnZeroIfNoEvenDigits() {
        //Arrange
        int expected = 0;
        //Act
        int result = Digits.numberEvenDigits(13579);
        //Assert
        assertEquals(expected, result);
    }
    //The number of odd digits in a integer
    @Test
    void shouldReturnNumberOddDigits() {
        //Arrange
        int expected = 3;
        //Act
        int result = Digits.numberOddDigits(12345);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnZeroIfNoOddDigits() {
        //Arrange
        int expected = 0;
        //Act
        int result = Digits.numberOddDigits(2468);
        //Assert
        assertEquals(expected, result);
    }
    //The sum of digits in a integer
    @Test
    void shouldReturnSumDigits() {
        //Arrange
        int expected = 15;
        //Act
        int result = Digits.sumDigits(12345);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnSumDigitsNegative() {
        //Arrange
        int expected = 15;
        //Act
        int result = Digits.sumDigits(-12345);
        //Assert
        assertEquals(expected, result);
    }
    //The sum of even digits in a integer
    @Test
    void shouldReturnSumEvenDigits() {
        //Arrange
        int expected = 6;
        //Act
        int result = Digits.sumEvenDigits(12345);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnZeroIfNoEvenDigitsToSum() {
        //Arrange
        int expected = 0;
        //Act
        int result = Digits.sumEvenDigits(13579);
        //Assert
        assertEquals(expected, result);
    }
    //The sum of odd digits in a integer
    @Test
    void shouldReturnSumOddDigits() {
        //Arrange
        int expected = 9;
        //Act
        int result = Digits.sumOddDigits(12345);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnZeroIfNoOddDigitsToSum() {
        //Arrange
        int expected = 0;
        //Act
        int result = Digits.sumOddDigits(2468);
        //Assert
        assertEquals(expected, result);
    }

}