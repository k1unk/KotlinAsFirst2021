package lesson6.task1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MyTests {
    @Test
    fun bestLongJumpOnlyNumbers() {
        assertEquals(100, bestLongJump("100"))
        assertEquals(120, bestLongJump("100 111 120"))
        assertEquals(120, bestLongJump("120 111 100"))
        assertEquals(120, bestLongJump("111 120 100"))
    }

    @Test
    fun bestLongJumpCorrectInputValues() {
        assertEquals(111, bestLongJump("100 - 111"))
        assertEquals(111, bestLongJump("% 111 100"))
        assertEquals(100, bestLongJump("- % - - 100"))
        assertEquals(120, bestLongJump("100 - % - - 120 - % % % 111 - -"))
        assertEquals(0, bestLongJump("0 % -"))
    }

    @Test
    fun bestLongJumpIncorrectInputValues() {
        assertEquals(-1, bestLongJump(""))
        assertEquals(-1, bestLongJump("% - %"))
        assertEquals(-1, bestLongJump("100 % - % -111"))
        assertEquals(-1, bestLongJump("100% 111 120"))
        assertEquals(-1, bestLongJump("100 -- 111 120 %"))
        assertEquals(-1, bestLongJump("100, 111, 120"))
        assertEquals(-1, bestLongJump("100.1 111.2 120.3"))
    }
}