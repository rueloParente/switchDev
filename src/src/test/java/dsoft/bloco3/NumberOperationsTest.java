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


}