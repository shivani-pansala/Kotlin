fun main()
{
    print("Enter a number=")
    var no:Int= readLine()!!.toInt()

    var m:Int
    var res :Int=0
    while (no>0)
    {
        m=no%10
        res=(res*10)+m
        no=no/10
    }
    print("Reverse number is $res")
}
