fun main()
{
    for(i in 1..5)
    {
        for(s in 5 downTo i)
        {
            print(" ")
        }
        for (j in 1..i)
        {
            print("* ")
        }
          println()
    }
}
