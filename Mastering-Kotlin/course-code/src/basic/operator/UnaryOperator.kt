package basic.operator

class UnaryOperator {
    fun operator(){
        println("\nThere are 5 kind of Assignment Operator: + - ++ -- !(not)")

        val x = -15
        var y = 11

        println("Value of x -> $x \t Value of y -> $y")
        println("When \"-x\" is written it means \"-(x)\" then x -> ${-x}")
        println("When \"+x\" is written it means \"+(x)\" then x -> ${+x}")
        println("Same for y \"-y -> ${-y}\"")
        println("Same for y \"+y -> ${+y}\"")

        var result = ++y
        println("When ++ is in front of a variable it is increase the value by 1 like ++y -> $result $y")

        y = 11
        result = y++
        println("$result $y")

    }
}