fun main()
{
    print("Enter a number=")
    var no:Int= readLine()!!.toInt()

    var m:Int=0
    var Even:Int=0
    var Odd:Int=0
    while(no>0)
    {
        m=no%10
        no=no/10

        if(m%2==0)
        {
            Even++
        }
        else
        {
            Odd++
        }
    }
    println("Even Digit is $Even ")
    println("Odd Digit is $Odd ")


}