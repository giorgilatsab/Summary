class Palindrome {
    fun polindrome(word:String):Boolean{
        return word.replace(" ","").toLowerCase() == word.replace(" ", "").toLowerCase().reversed()
    }
}