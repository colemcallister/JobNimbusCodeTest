import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class StringVerifierTest {

    private lateinit var stringVerifier: StringVerifier

    @Before
    fun setup() {
        stringVerifier = StringVerifier()
    }

    /**
     * Main tests
     */
    @Test
    fun `haveMatchingBrackets - two brackets - returns true`() {
        assertTrue(stringVerifier.haveMatchingBrackets("{}"))
    }

    @Test
    fun `haveMatchingBrackets - close bracket first - returns false`() {
        assertFalse(stringVerifier.haveMatchingBrackets("}{"))
    }

    @Test
    fun `haveMatchingBrackets - two open, one close - returns false`() {
        assertFalse(stringVerifier.haveMatchingBrackets("{{}"))
    }

    @Test
    fun `haveMatchingBrackets - empty string - returns true`() {
        assertTrue(stringVerifier.haveMatchingBrackets(""))
    }

    @Test
    fun `haveMatchingBrackets - random characters non-brackets - returns true`() {
        assertTrue(stringVerifier.haveMatchingBrackets("abc...xyz"))
    }

    /**
     * Other tests
     */
    @Test
    fun `haveMatchingBrackets - one open, two close - returns false`() {
        assertFalse(stringVerifier.haveMatchingBrackets("{}}"))
    }

    @Test
    fun `haveMatchingBrackets - one open - returns false`() {
        assertFalse(stringVerifier.haveMatchingBrackets("{"))
    }

    @Test
    fun `haveMatchingBrackets - one close - returns false`() {
        assertFalse(stringVerifier.haveMatchingBrackets("}"))
    }

    @Test
    fun `haveMatchingBrackets - open and close with random characters - returns true`() {
        assertTrue(stringVerifier.haveMatchingBrackets("a{b}c"))
    }

    @Test
    fun `haveMatchingBrackets - multiple open and close - returns true`() {
        assertTrue(stringVerifier.haveMatchingBrackets("{{{}}{}{{}}}{}"))
    }
}