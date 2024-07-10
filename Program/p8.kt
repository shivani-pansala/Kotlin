fun main()
{
    for(i in 1..5)
    {
        for(j in 1..5)
        {
            if((j==1 || j==5)||(i==1 || i==5))
            {
                print("*")
            }
            else
            {
                print(" ")
            }
        }
        println()
    }
}