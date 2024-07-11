fun main()
{
    print("Enter a number=")
    var no:Int= readLine()!!.toInt()

    var m:Int
    var sum:Int=0
    var temp=no
    while (no>0)
    {
        m=no%10
        sum=sum+(m*m*m)
        no=no/10
    }
    if(sum==temp)
    {
        print("It is Armstrong Number")
    }
    else
    {
        print("It is not Armstrong Number")
    }

}