import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * RECONSTRUCTION NOTICE
 * ---------------------
 * The official UMGC Virtual Lab project and instructor-provided
 * NumberProgramTest.java file could not be accessed because the embedded
 * Microsoft login repeatedly refused to connect.
 *
 * This test file was reconstructed with the assistance of OpenAI ChatGPT
 * from the behavior explicitly described in the Unit 8 Lab 2 instructions:
 *   1) findResult(int[] values) ultimately returns the largest integer.
 *   2) If the array is empty, the final version returns Integer.MIN_VALUE.
 *
 * These tests are NOT represented as the original instructor-provided tests.
 * If the original test file becomes available, it should supersede this file.
 */

public class NumberProgramTest {

    @Test
    void largestValueAtBeginning() {
        assertEquals(9, NumberProgram.findResult(new int[]{9, 2, 5, 1}));
    }

    @Test
    void largestValueAtEnd() {
        assertEquals(10, NumberProgram.findResult(new int[]{1, 4, 3, 10}));
    }

    @Test
    void allNegativeValues() {
        assertEquals(-2, NumberProgram.findResult(new int[]{-9, -2, -7, -12}));
    }

    @Test
    void singleElementArray() {
        assertEquals(7, NumberProgram.findResult(new int[]{7}));
    }

    @Test
    void emptyArrayReturnsMinValue() {
        assertEquals(Integer.MIN_VALUE, NumberProgram.findResult(new int[]{}));
    }
}
