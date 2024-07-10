fun main()
{
    print("Enter a number=")
    var n:Int= readLine()!!.toInt()

    for(i in 1..n)
    {
        print(" $i/${i+1} ,")
    }
}