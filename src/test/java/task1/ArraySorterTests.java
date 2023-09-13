package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArraySorterTests {

    @Test
    void testSortedArray() {
        //Given
        int size = 4;
        String values = "1 2 3 4";
        ArraySorter arraySorter = new ArraySorter();

        //When
        boolean result = arraySorter.isSortedAscending(size, values);

        //Then
        assertTrue(result);
    }

    @Test
    void testUnsortedArray() {
        //Given
        int size = 4;
        String values = "1 2 3 0";
        ArraySorter arraySorter = new ArraySorter();

        //When
        boolean result = arraySorter.isSortedAscending(size, values);

        //Then
        assertFalse(result);
    }

    @Test
    void testInvalidValues() {
        //Given
        int size = 4;
        String values = "1 2 3 a";
        ArraySorter arraySorter = new ArraySorter();

        //When
        boolean result = arraySorter.isSortedAscending(size, values);

        //Then
        assertFalse(result);
    }

    @Test
    void testArrayOutOfBounds() {
        //Given
        int size = 5;
        String values = "1 2 3 4";
        ArraySorter arraySorter = new ArraySorter();

        //When
        boolean result = arraySorter.isSortedAscending(size, values);

        //Then
        assertFalse(result);
    }
}
