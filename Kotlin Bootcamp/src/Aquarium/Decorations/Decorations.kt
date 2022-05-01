package Aquarium.Decorations

fun main(args: Array<String>) {
    makeDecorations()
}

fun makeDecorations() {
    val d1 = Decorations("granite")
    println(d1)

    val d2 = Decorations("slate")
    println(d2)

    val d3 = Decorations("slate")
    println(d3)

    println(d1.equals(d2))
    println(d2.equals(d3))

    val d4 = d2.copy()
    println(d4)

    val d5 = Decorations2("crystal", "wood", "diver")
    println(d5)

    val (rock, wood, diver) = d5 //decomposition
    println(rock)
    println(wood)
    println(diver)

}

data class Decorations(val rocks: String) {

}

data class Decorations2(val rocks: String, val wood: String, val diver: String)