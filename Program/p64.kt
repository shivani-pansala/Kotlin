fun main()
{
    print("Enter a Number=")
    var no:Int = readLine()!!.toInt()

    var m:Int
    var sum:Int=0
    while (no>0)
    {
        m=no%10
        sum = sum+m
        no=no/10
    }
    print("Sum is = $sum")

}