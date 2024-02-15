package basic.operator

class LogicalOperator {
    fun operator(){
        println("\nThere are 2 kind of Logical Operator: && ||\n")
        println("\"&&\" is and operator. It means if any condition from both side is true, it will return true.")
        println("\"||\" is or operator. It means if both condition from both side have to be true to return true.\n")

        val x = 17
        val y = 17
        val z = 3
        println("x >= y && y >= z -> ${x >= y && y >= z}")
        println("x >= y || y >= z -> ${x >= y || y >= z}")

    }
}