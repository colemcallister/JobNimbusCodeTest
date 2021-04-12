
class StringVerifier {
    fun haveMatchingBrackets(input: String): Boolean {
        var numberOfOpenBracketsUnclosed = 0

        input.forEach { character ->
            if (character == '{') {
                numberOfOpenBracketsUnclosed++
            } else if (character == '}' && numberOfOpenBracketsUnclosed > 0) {
                numberOfOpenBracketsUnclosed--
            } else if (character == '}') {
                return false
            }
        }

        return numberOfOpenBracketsUnclosed == 0
    }
}