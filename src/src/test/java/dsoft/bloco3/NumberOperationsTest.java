package dsoft.bloco3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOperationsTest {
    @Test
    void shouldReturnTrueIfNumberIsPalindromic() {
        //Arrange
        boolean expected = true;
        //Act
        boolean result = NumberOperations.isNumberPalindromic(12321);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnFalseIfNumberIsNotPalindromic() {
        //Arrange
        boolean expected = false;
        //Act
        boolean result = NumberOperations.isNumberPalindromic(12345);
        //Assert
        assertEquals(expected, result);
    }
    //Amstrong number
    @Test
    void shouldReturnTrueIfNumberIsAmstrong() {
        //Arrange
        boolean expected = true;
        //Act
        boolean result = NumberOperations.isNumberAmstrong(153);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnFalseIfNumberIsNotAmstrong() {
        //Arrange
        boolean expected = false;
        //Act
        boolean result = NumberOperations.isNumberAmstrong(123);
        //Assert
        assertEquals(expected, result);
    }
    //First capicua in range
    @Test
    void shouldReturnFirstPalindromicInRange() {
        //Arrange
        int expected = 101;
        //Act
        int result = NumberOperations.firstPalindromicInRange(100, 200);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnMinusOneIfNoPalindromicInRange() {
        //Arrange
        int expected = -1;
        //Act
        int result = NumberOperations.firstPalindromicInRange(12, 21);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    //palindromic has to be a real number, negative numbers are not palindromic
    void shouldReturnFirstPalindromicInRangeNegative() {
        //Arrange
        int expected = 121;
        //Act
        int result = NumberOperations.firstPalindromicInRange(120, 130);
        //Assert
        assertEquals(expected, result);
    }


}