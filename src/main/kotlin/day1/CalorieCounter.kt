import java.io.File

private const val RESOURCE_LOCATION = "src/main/resources"

fun main() {
    fun part1(input: String) = input.split("\r\n\r\n").map { line ->
        line.split("\r\n").filter { it.isNotBlank() }.map { cal -> cal.toInt() }
    }.maxOfOrNull { it.sum() }

    fun part2(input: String) = input.split("\r\n\r\n").map { line ->
        line.split("\r\n").filter { it.isNotBlank() }.map { cal -> cal.toInt() }
    }.map { it.sum() }.sortedDescending().take(3).sum()

    val testInput = readInput("day1/test")
    check(part1(testInput) == 24000)

    val input = readInput("day1/input")
    println(part1(input))
    println(part2(input))
}


fun readInput(name: String) = File(RESOURCE_LOCATION, "$name.txt").readText()
