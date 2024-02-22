import basic.*
import basic.operator.*

fun greetingWithMyName(name: String){
    println("Hello! $name. Welcome to kotlin learning")
}

fun main() {

    println("*--------------------------------* about variable *-----------------------------------------------------*")
    val variable = Variable()
    variable.variableAndMathCalculation()

    println("*--------------------------------* about data type *----------------------------------------------------*")

    val dataType = DataType()
    dataType.allTheDataTypeKotlinHas()

    println("*--------------------------------* about mathematical operator *----------------------------------------*")

    val mathematicalOperator = MathematicalOperator()
    mathematicalOperator.operator()

    println("*--------------------------------* about Relational operator *------------------------------------------*")

    val relationalOperator = RelationalOperator()
    relationalOperator.operator()

    println("*--------------------------------* about Assignment operator *------------------------------------------*")

    val assignmentOperator = AssignmentOperator()
    assignmentOperator.operator()

    println("*--------------------------------* about Unary operator *-----------------------------------------------*")

    val unaryOperator = UnaryOperator()
    unaryOperator.operator()

    println("*--------------------------------* about Logical operator *-----------------------------------------------*")

    val logicalOperator = LogicalOperator()
    logicalOperator.operator()

    println("*--------------------------------* about Bitwise operator *-----------------------------------------------*")

    val bitwiseOperator = BitwiseOperator()
    bitwiseOperator.operator()

    val myName : String = readln()
    println("My name is: $myName")

    greetingWithMyName(readln())
    val cars  = arrayOf("Volvo", "Nissan", "Toyota", "Mazda", "porsche")

    for (x in cars){
        println(x)
    }
}
