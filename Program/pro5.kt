fun main()
{

    var p : Double = 1000.0
    var r : Double = 0.05
    var n : Int = 2
    var t : Double = 5.0

    var amount = CI(p,r,t,n)
    println("Compound Intrest = $amount")

}

fun CI(p:Double,r:Double,t:Double,n:Int):Double
{
    var amount = p*Math.pow(1+r/n,n*t)
    return amount
}