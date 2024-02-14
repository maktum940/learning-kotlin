package basic

class DataType {
    /**
     * there are 6 or 7 type of data type in kotlin.
     *
     * Note: if a value is declared val myCGPA = 3.5. it will be considered double value
     * which will take 64 byte of space.
     */
    fun allTheDataTypeKotlinHas(){
        val myName : String = "Maktum"
    val myAge : Int = 21
        val myPhoneNumber : Long = 12345678901
        val myCGPA : Float = 3.5f
        val valueOfPi : Double = 3.14159265358979
        val boolean : Boolean = true

        println("My name is: $myName, My age is: $myAge, My phone number is: $myPhoneNumber and My CGP is: $myCGPA.")
        println("The value of pi is: $valueOfPi. The boolean value is: $boolean")
    }
}