fun main()
{
    print("Enter value of X = ")
    var x = readLine()!!.toInt()
    print("Enter value of Y = ")
    var y = readLine()!!.toInt()

    var result = (x+y)/(x-y)

    println("Result = $result")
}