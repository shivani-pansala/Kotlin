fun main()
{
    print("Enter a number=")
    var no :Int= readLine()!!.toInt()

    for(i in 1..no)
    {
        if(i % 4 !=0)
        print(" $i ")
    }
}