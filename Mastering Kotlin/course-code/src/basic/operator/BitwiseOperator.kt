package basic.operator

class BitwiseOperator {
    fun operator() {
        println("\nThere are 7 kind of Assignment Operator: << >> >>> & | ^ ~\n")

        println("and(bits) - bitwise and (&)")
        println("or(bits) - bitwise or (|)")
        println("xor(bits) - bitwise xor (^)")
        println("shl(bits) - signed shift left (<<)")
        println("shr(bits) - signed shift right (>>)")
        println("ushl(bits) - unsigned shift right (>>>)")
        println("inv(bits) - bitwise inversion (~)\n")

        val x = 13
        val y = 2

        println("binary of x is -> ${Integer.toBinaryString(x)}\nbinary of y is -> ${Integer.toBinaryString(y)}\n")

        var res = x.and(y)
        println("value of x.and(y) -> $res")

        res = x.or(y)
        println("value of x.or(y) -> $res")

        res = x.xor(y)
        println("value of x.xor(y) -> $res")

        res = x.shl(y)
        println("value of x.shl(y) -> $res")

        res = x.shr(y)
        println("value of x.shr(y) -> $res")

        res = x.ushr(y)
        println("value of x.ushr(y) -> $res")

        res = x.inv()
        println("value of x.inv() -> $res")
    }
}