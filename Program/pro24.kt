fun main()
{
    print("Enter a first number=")
    var no1 = readLine()!!.toInt()
    print("Enter a second number=")
    var no2 = readLine()!!.toInt()

    if(no1<no2)
    {
        println("no1 is Minimum = $no1")
    }
    else
    {
        println("no2 is Minimum = $no2")
    }

}