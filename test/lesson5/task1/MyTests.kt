package lesson5.task1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MyTests {

    @Test
    fun whoAreInBothNoEqualValues() {
        assertEquals(
            emptyList<String>(),
            whoAreInBoth(emptyList(), emptyList())
        )

        assertEquals(
            emptyList<String>(),
            whoAreInBoth(listOf("Андрей", "Борис"), listOf("Владимир", "Геннадий", "Даниил"))
        )

        assertEquals(
            emptyList<String>(),
            whoAreInBoth(listOf("Андрей", "Борис"), emptyList())
        )
    }

    @Test
    fun whoAreInBothOneEqualValue() {
        assertEquals(
            listOf("Андрей"),
            whoAreInBoth(listOf("Андрей", "Борис"), listOf("Андрей", "Владимир"))
        )

        assertEquals(
            listOf("Андрей"),
            whoAreInBoth(listOf("Андрей", "Борис", "Даниил"), listOf("Андрей", "Владимир", "Геннадий"))
        )
    }

    @Test
    fun whoAreInBothSeveralEqualValue() {
        assertTrue(
            listOf(listOf("Андрей", "Борис"), listOf("Борис", "Андрей")).contains(
                whoAreInBoth(listOf("Андрей", "Борис", "Владимир"), listOf("Геннадий", "Борис", "Андрей"))
            )
        )
    }

    @Test
    fun whoAreInBothRepeatedInputValues() {
        assertEquals(
            listOf("Андрей"),
            whoAreInBoth(listOf("Андрей", "Андрей"), listOf("Андрей", "Андрей"))
        )

        assertEquals(
            listOf("Андрей"),
            whoAreInBoth(listOf("Андрей", "Борис"), listOf("Андрей", "Андрей", "Андрей"))
        )

        assertTrue(
            listOf(listOf("Андрей", "Борис"), listOf("Борис", "Андрей")).contains(
                whoAreInBoth(
                    listOf("Андрей", "Борис", "Андрей", "Борис"),
                    listOf("Андрей", "Андрей", "Борис", "Владимир")
                )
            )
        )

        assertTrue(
            listOf(listOf("Андрей", "Борис"), listOf("Борис", "Андрей")).contains(
                whoAreInBoth(listOf("Андрей", "Борис", "Борис"), listOf("Геннадий", "Борис", "Андрей"))
            )
        )
    }

}
