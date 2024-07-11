fun main()
{
     var fact:Int=1
    print("Enter a number=")
    var no:Int = readLine()!!.toInt()

    for(i in no downTo 1)
    {
        fact = fact*i
    }
    print("Factorial is $fact")

}