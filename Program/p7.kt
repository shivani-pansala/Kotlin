fun main()
{
    for(i in 1..5)
    {
        for(j in 1..5)
        {
            if(j in 1..i)
            {
                print("X")
            }
            else
            {
                print("0")
            }
        }
        println()
    }
}