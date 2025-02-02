package cpit305.fcit.kau.edu.sa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Lab1Test {
    @Test
    void testValidSquares() {
        assertEquals(0, SquareCalcApp.square(0));
        assertEquals(1, SquareCalcApp.square(1));
        assertEquals(10000, SquareCalcApp.square(100));
        assertEquals(25, SquareCalcApp.square(5));
    }

    @Test
    void testOutOfRangeNumbers() {
        Exception exception1 = assertThrows(IllegalArgumentException.class, () -> SquareCalcApp.square(-1));
        assertNotNull(exception1.getMessage());
        assertFalse(exception1.getMessage().isEmpty());

        Exception exception2 = assertThrows(IllegalArgumentException.class, () -> SquareCalcApp.square(101));
        assertNotNull(exception2.getMessage());
        assertFalse(exception2.getMessage().isEmpty());
    }
}
