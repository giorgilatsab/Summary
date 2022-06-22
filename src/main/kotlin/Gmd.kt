class Gmd {
    var numb = 1
    var gmd = 1

    fun gmdreturn(numb1:Int, numb2:Int):Int{
        while (numb1>numb && numb2>numb){
            if (numb1 % numb == 0 && numb2 % numb == 0)
                gmd = numb
            numb++
        }
        return gmd
    }
}