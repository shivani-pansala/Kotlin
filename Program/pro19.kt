fun main()
{
    print("Enter value of X = ")
    var x = readLine()!!.toInt()
    print("Enter value of Y = ")
    var y = readLine()!!.toInt()

    var result = (2*x)+(3*y)/(x*y)

    println("Result = $result")
}