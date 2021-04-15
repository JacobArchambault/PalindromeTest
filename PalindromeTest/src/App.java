
public class App {

	/**
	 * The isPalindrome method determines whether a string* is a palindrome.*
	 *
	 * @param str The string to test.*
	 * @return This method returns true if str contains a palindrome. It returns
	 *         false otherwise.
	 */
	public static boolean isPalindrome(final String str) {
		return str.length() <= 1 ? true
				: str.charAt(0) == str.charAt(str.length() - 1) ? App.isPalindrome(str.substring(1, str.length() - 1))
						: false;
	}

	public static void main(final String[] args) {
		// Create an array of strings to test.
		final String[] testStrings = { "Able was I ere I saw Elba", "Four score and seven years ago",
				"Now is the time for all good men", "Desserts I stressed", "Ask not what your country can do for you",
				"Kayak" };
		// Test the strings.
		for (final String testString : testStrings) {
			System.out.println(App.isPalindrome(testString.toUpperCase()) ? testString + " is a palindrome.\n"
					: testString + " is not a palindrome.\n");
		}
	}
}
