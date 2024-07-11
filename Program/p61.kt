fun main()
{
    var count:Int=0
    print("Enter a number=")
    var no:Int= readLine()!!.toInt()

    for(i in 1..no)
    {
        if(no%i==0)
        {
            count++
        }
    }
    if(count==2)
    {
        print("IT Is Prime")
    }
    else
    {
        print("IT is Not Prime")
    }
}