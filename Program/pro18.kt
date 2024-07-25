fun main()
{
    print("Enter value of X = ")
    var x = readLine()!!.toInt()
    print("Enter value of Y = ")
    var y = readLine()!!.toInt()

    var result = (3*x*x)+(2*x*y)+(3*y*y)

    println("Result = $result")
}