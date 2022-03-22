package lesson7.task1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.File

class MyTests {

    private fun assertFileContent(fileName: String, expectedContent: String) {
        val file = File(fileName)
        val content = file.readLines().joinToString("\n")
        assertEquals(expectedContent, content)
    }

    @Test
    fun deleteMarkedEmptyFile() {
        deleteMarked("input/myInput/deleteMarked_in2.txt", "temp.txt")
        assertFileContent(
            "temp.txt",
            ""
        )
        File("temp.txt").delete()


    }

    @Test
    fun deleteMarkedOnlyMarked() {
        deleteMarked("input/myInput/deleteMarked_in3.txt", "temp.txt")
        assertFileContent(
            "temp.txt",
            ""
        )
        File("temp.txt").delete()
    }

    @Test
    fun deleteMarked() {
        deleteMarked("input/myInput/deleteMarked_in1.txt", "temp.txt")
        assertFileContent(
            "temp.txt",
            """ _ оставить
.
 _
 _123
строка
строка______
с_т_р_о_к_а

    строка
 Строка""".trimIndent()
        )
        File("temp.txt").delete()
    }

}
