package string.algorithms;

import java.util.Arrays;

/**
 * Class contains algorithms for determining different qualities of given
 * strings
 */
public class StringAlgorithms {

    /**
     * Checks if tho given strings are anagrams
     *
     * @param firstString the first provided string
     * @param secondString the second provided string
     * @return Boolean
     */
    public static Boolean checkStringsAreAnagrams(String firstString, String secondString) {

        if (firstString.length() != secondString.length()) {
            return false;
        } else {

            char[] firstArray = firstString.toLowerCase().toCharArray();
            char[] secondArray = secondString.toLowerCase().toCharArray();

            Arrays.sort(firstArray);
            Arrays.sort(secondArray);

            return new String(firstArray).equals(new String(secondArray));
        }
    }

    /**
     * Checks if a string is palindrome
     *
     * @param string the string to be checked
     * @return Boolean
     */
    public static Boolean checkStringIsPalindrome(String string) {

        char[] stringArray = string.toCharArray();

        int i = 0;
        int n = stringArray.length - 1;

        while (i <= n/2) {
            if (stringArray[i] != stringArray[n]) {
                return false;
            }

            ++i;
            --n;

        }

        return true;

    }

}
