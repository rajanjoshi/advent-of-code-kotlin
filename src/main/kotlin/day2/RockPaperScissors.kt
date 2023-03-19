import java.io.File

private const val RESOURCE_ROOT = "src/main/resources"

fun main(){
    println('A'.code)
    println('Y'.code)
    val input = readInput(false)
    val lines = input.lines()
    val vals = lines.map { Regex("""(\w) (\w)""").find(it)!!.destructured }
        .map { (a, b) -> Pair(a[0].code-'A'.code, b[0].code-'X'.code) }
    val p1 = vals.sumOf { (x, y) -> y + 1 + 3 * ((y - x + 4) % 3) }
    val p2 = vals.sumOf { (x, y) -> 3 * y + ((x + y + 2) % 3) + 1 }
    println(p1)
    println(p2)
}


fun readInput(real: Boolean): String {
    val file = File(RESOURCE_ROOT, if(real) "day2/input.txt" else "day2/test.txt")
    return file.readText().replace("\r\n", "\n")
}
