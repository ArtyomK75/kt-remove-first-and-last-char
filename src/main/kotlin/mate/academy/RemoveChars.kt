package mate.academy

fun removeChars(str: String): String {
    return str.drop(1).dropLast(1)
}
