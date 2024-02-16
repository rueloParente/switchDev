package dsoft.bloco3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOperationsTest {
    @Test
    void shouldReturnTrueIfNumberIsCapicua() {
        //Arrange
        boolean expected = true;
        //Act
        boolean result = NumberOperations.isNumberCapicua(12321);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnFalseIfNumberIsNotCapicua() {
        //Arrange
        boolean expected = false;
        //Act
        boolean result = NumberOperations.isNumberCapicua(12345);
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


}