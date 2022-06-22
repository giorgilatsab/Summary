class Lcm {
    fun lcmReturn(numb1: Int, numb2: Int):Int{
        var lcm = 1
        var numb3 = 1

        if (numb1 > numb2){
            numb3 = numb1
        }
        else numb3 = numb2

        while (true){
            if ( numb3 % numb1 == 0 && numb3 % numb2 == 0 ){
                lcm = numb3
                break
            }
            numb3++
        }
        return lcm
    }
}