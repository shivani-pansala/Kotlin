fun main()
{
   print("Enter a number=")
    var no:Int= readLine()!!.toInt()

    var m:Int
    var sum:Int=0
    var temp=no
    while(no>0)
    {
       m=no%10
       sum=(sum*10)+m
       no=no/10
    }
    if(temp==sum)
    {
        print("IT is palindrom number")
    }
    else
    {
        print("It is not palindrom number")
    }
}