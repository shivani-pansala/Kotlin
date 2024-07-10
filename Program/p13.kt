fun main()
{
    var n:Int=1
    for(i in 1..5)
    {
        for(j in 1..i)
        {
            print(" $n ")
            n++
        }
        println()
    }
}