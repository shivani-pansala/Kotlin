fun main()
{
    print("Enter a 1 value = ")
    val no1 = readLine()!!.toInt()
    print("Enter a 2 value = ")
    val no2 = readLine()!!.toInt()
    print("Enter a 3 value = ")
    val no3 = readLine()!!.toInt()
    print("Enter a 4 value = ")
    val no4 = readLine()!!.toInt()
    print("Enter a 5 value = ")
    val no5 = readLine()!!.toInt()

    val sum = no1+no2+no3+no4+no4+no5

    val avg = sum/5

    println("Average is = $avg")
}
