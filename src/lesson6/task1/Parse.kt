@file:Suppress("UNUSED_PARAMETER", "ConvertCallChainIntoSequence")

package lesson6.task1

/**
 * Средняя (5 баллов)
 *
 * Результаты спортсмена на соревнованиях в прыжках в длину представлены строкой вида
 * "706 - % 717 % 703".
 * В строке могут присутствовать числа, черточки - и знаки процента %, разделённые пробелами;
 * число соответствует удачному прыжку, - пропущенной попытке, % заступу.
 * Прочитать строку и вернуть максимальное присутствующее в ней число (717 в примере).
 * При нарушении формата входной строки или при отсутствии в ней чисел, вернуть -1.
 */
fun bestLongJump(jumps: String): Int {
    val results = jumps.split(Regex("""[\s\-%]"""))
    var maxResult = -1
    if (jumps.contains(Regex("""[^\d\s\-%)]""")) ||
        jumps.contains(Regex("""([\-%])(-|%|\d)|(-|%|\d)([\-%])"""))) return -1

    for (element in results)
        if (element.isNotEmpty() && element.toInt() > maxResult)
            maxResult = element.toInt()
    return maxResult
}
