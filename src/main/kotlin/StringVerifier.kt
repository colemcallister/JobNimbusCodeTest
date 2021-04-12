
class StringVerifier {
    fun haveMatchingBrackets(input: String): Boolean {
        var numberOfOpenBrackets = 0

        input.forEach { character ->
            if (character == '{') {
                numberOfOpenBrackets++
            } else if (character == '}' && numberOfOpenBrackets > 0) {
                numberOfOpenBrackets--
            } else if (character == '}') {
                return false
            }
        }

        return numberOfOpenBrackets == 0
    }
}