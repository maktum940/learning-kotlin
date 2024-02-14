package basic.operator

class RelationalOperator {
    fun operator(){
        println("\nThere are 6 kind of Relational Operator: > < >= <= == !=")

        var x = 4
        var y = 10

        println("Value of x -> $x \t Value of y -> $y\n")

        println("x > y will return -> ${x > y}")
        println("x < y will return -> ${x < y}")
        println("x >= y will return -> ${x >= y}")
        println("x <= y will return -> ${x <= y}")
        println("x == y will return -> ${x == y}")
        println("x != y will return -> ${x != y}")

        x = 10

        println("\nAfter changing x to Value -> 10 \nvalue of x -> $x \t Value of y -> $y\n")

        println("x >= y will return -> ${x >= y}")
        println("x <= y will return -> ${x <= y}")
        println("x == y will return -> ${x == y}")
        println("x != y will return -> ${x != y}")

    }
}