package basic.operator

class MathematicalOperator {
    fun operator(){

        println("\nThere are 5 kind of Mathematical Operator: + - * / %")

        val x = 10
        val y = 3

        println("Value of x -> $x \t Value of y -> $y")

        var result = x+y
        println("x+y = $result")

        result = x-y
        println("x-y = $result")

        result = x*y
        println("x*y = $result")

        result = x/y
        println("x/y = $result")

        result = x%y
        println("x%y = $result\n")
    }
}