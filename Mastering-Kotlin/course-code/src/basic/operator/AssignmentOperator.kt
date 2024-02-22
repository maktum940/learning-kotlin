package basic.operator

class AssignmentOperator {
    fun operator(){

        println("\nThere are 6 kind of Assignment Operator: = += -= *= /= %=")

        var x = 13
        val y = 3

        println("When \"x = 13, y = 3\" is written x -> $x, y -> $y\n")
        x += y
        println("When \"x += y\" is written it means \"x = x+y\" then x -> $x")
        x = 13
        x -= y
        println("When \"x -= y\" is written it means \"x = x-y\" then x -> $x")
        x = 13
        x *= y
        println("When \"x *= y\" is written it means \"x = x*y\" then x -> $x")
        x = 13
        x /= y
        println("When \"x /= y\" is written it means \"x = x/y\" then x -> $x")
        x = 13
        x %= y
        println("When \"x %= y\" is written it means \"x = x%y\" then x -> $x\n")
    }
}