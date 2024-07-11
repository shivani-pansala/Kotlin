fun main()
{
    var square:Int=1
    var cubes:Int=1

    for(i in 1..10)
    {
        square = i*i
        cubes = i*i*i

        var fact:Int=1
        for(j in 1..i)
        {
            fact = fact*j
        }
        print("Square $i = $square   Cube $i =  $cubes    Fact $i = $fact  \n"  )
    }
    println()
}