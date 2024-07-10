fun main()
{
    var c:Char='A'
    for(i in 'A'..'E')
    {
        for(j in 'A'..i)
        {
            print(" $c ")
            c++
        }
        println()
    }
}