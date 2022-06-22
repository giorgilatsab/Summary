fun main(args: Array<String>) {
    val lcm = Lcm()
    val gmd = Gmd()
    val string = `WordConteins$`()
    val sum = SumNumbs()
    val reverse = ReverseNumber()
    val palindrome = Palindrome()

    println(gmd.gmdreturn(40,12))

    println(lcm.lcmReturn(16,12))

    println(string.StringConteins("fdfd$"))

    println(sum.sumnum())

    println((reverse.reverse(12300)))

    println(palindrome.polindrome(""))

}