fun main()
{
    print("Enter a number=")
    var no:Int= readLine()!!.toInt()

    var m:Int=0
    var Count:Int=0
    while(no>0)
    {
        m=no%10
        no=no/10

        if(m==0)
        {
            Count++
        }

    }
    println("Zero is = $Count ")
}