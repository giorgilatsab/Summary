class SumNumbs {
    fun sumnum(add:Int = 100):Int{
        var sum = 0
            if ( add in 0 .. 100)
                sum =  add + sumnum(add-2)
        return sum
    }
}