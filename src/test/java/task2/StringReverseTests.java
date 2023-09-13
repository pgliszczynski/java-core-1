package task2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverseTests {

    private static String stringToReverse;
    private static String expectedString;
    private static StringReverse stringReverse;

    @BeforeAll
    public static void prepareVariables() {
        stringToReverse = "I'm going to go to school today morning.";
        expectedString = ".gninrom yadot loohcs ot og ot gniog m'I";
        stringReverse = new StringReverse();
    }

    @Test
    void testReverseStringBuffer() {
        //Given

        //When
        String reversedString = stringReverse.reverseStringBuffer(stringToReverse);

        //Then
        assertEquals(expectedString, reversedString);
    }

    @Test
    void testReverseStringBuilder() {
        //Given

        //When
        String reversedString = stringReverse.reverseStringBuilder(stringToReverse);

        //Then
        assertEquals(expectedString, reversedString);
    }

    @Test
    void testReverseStringForLoop() {
        //Given

        //When
        String reversedString = stringReverse.reverseStringForLoop(stringToReverse);

        //Then
        assertEquals(expectedString, reversedString);
    }

    @Nested
    class ReverseStringArrayTests {
        @Test
        void testReverseStringArrayEven() {
            //Given

            //When
            String reversedString = stringReverse.reverseStringArray(stringToReverse);

            //Then
            assertEquals(expectedString, reversedString);
        }

        @Test
        void tetReverseStringArrayOdd() {
            //Given
            String stringToReverse = "I'm going to go to school today morning";
            String expectedString = "gninrom yadot loohcs ot og ot gniog m'I";

            //When
            String reversedString = stringReverse.reverseStringArray(stringToReverse);

            //Then
            assertEquals(expectedString, reversedString);
        }
    }
}
