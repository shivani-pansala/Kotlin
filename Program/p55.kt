fun main()
{
    print("Enter a number=")
    var no:Int= readLine()!!.toInt()

    for(i in 1..10)
    {
        println("$no" + "X" + "$i" + "="  + "${no*i}")
    }
}