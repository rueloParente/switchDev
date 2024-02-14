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

}