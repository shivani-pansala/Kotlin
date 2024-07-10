fun main()
{
    print("Principle number=")
    var p= readLine()!!.toInt()

    print("Rate is =")
    var r= readLine()!!.toInt()

    print("Year is =")
    var n= readLine()!!.toInt()

    var si = "${p*r*n/100}"
    println("Simple Interest= $si")

}