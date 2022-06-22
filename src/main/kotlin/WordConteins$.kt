class `WordConteins$` {
    fun StringConteins(word:String):Boolean{
        var newWord: Boolean = false
        newWord = word.contains("$")
        return newWord
    }
}