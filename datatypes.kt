fun main() {
    var name:String="Suraj Singh"
    val age:Int=20 // syntax of intizalization
    println("Name= $name ,age= $age")

//Integer
    val maxInt: Int=Int.MAX_VALUE
    val minInt: Int=Int.MIN_VALUE
    println("Max Value= $maxInt ,Min Value= $minInt")

    // val heli:Int=214748648 this make the program led to error because it exceed the limit of integer data type
    
    /*Let go with BYTE */
    val maxB: Byte=Byte.MAX_VALUE
    val minB: Byte=Byte.MIN_VALUE
    println("Max Value= $maxB ,Min Value= $minB")


// Long
    val maxC: Short=Short.MAX_VALUE
    val minC: Short=Short.MIN_VALUE
    println("Max Value= $maxC ,Min Value= $minC")

    // Long
    val maxD: Long=Long.MAX_VALUE
    val minD: Long=Long.MIN_VALUE
    println("Max Value= $maxD ,Min Value= $minD")

    //also we can initialize the value in Long
    val number= 28L

    //Float and Double

    val maxE: Float=Float.MAX_VALUE
    val minE: Float=Float.MIN_VALUE
    println("Max Value= $maxD ,Min Value= $minD")

    var myNamee= 23.5f //or 23.5F answer will be same
    var myNameee=23.5
}