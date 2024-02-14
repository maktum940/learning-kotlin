package basic

class Variable {
    /**
    * there are 2 type of variable.
    * val(value) and var(variable).
    * val which is value can't be changed.
    * But var which is variable can be changed from anywhere in the code.
    */
    fun variableAndMathCalculation(){
        //variable initialization of a value.
        val name = "Max"
        //variable initialization of a variable.
        var age = 24

        println("\nThat person's name is: $name. His age is: $age")
        age += 2
        println("After 2 year later his name is: $name. But his age is: $age\n")
    }
}