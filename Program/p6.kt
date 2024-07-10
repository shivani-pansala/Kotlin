fun main()
{
    for(i in 1..5)
    {
        for(j in 1..5)
        {
            if(j in 1..i)
            {
                print("$i")
            }
            else
            {
                print("$")
            }

        }
        println()
    }
}