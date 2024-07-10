fun  main()
{
    print("Enter one number=")
    var A = readLine()!!.toInt()

    print("Enter second number=")
    var B= readLine()!!.toInt()

    var sum= "${A+B}"
    println("Addition is = $sum")

    var sub= "${A-B}"
    println("Substraction is = $sub")

    var mul= "${A*B}"
    println("Multiplication is = $mul")

    var div= "${A/B}"
    println("Division is = $div")

    var mod= "${A%B}"
    println("Modular is = $mod")


}