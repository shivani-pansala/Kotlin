fun main()
{
    print("Enter Your salary")
    var salary = readLine()!!.toInt()

    var bouns = salary*10
    var totalsalary = salary + bouns

    println("Your salary = $salary")
    println("Your Bouns = $bouns")
    println("Total Salary with Bouns = $totalsalary")
}