fun main()
{
    print("Enter a Radius=")
    var r = readLine()!!.toDouble()
    print("Enter a height=")
    var h = readLine()!!.toDouble()

    var volume = 3.14 * r *r *h
    println("CylinderVolume is = $volume")
}