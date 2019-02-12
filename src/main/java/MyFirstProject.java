import hello.world.HelloWorld;
import string.algorithms.StringAlgorithms;

/**
 * Class used for running different pre-employment program scenarios.
 */
public class MyFirstProject {

    /**
     * Main method gathers all functions. Execution path is decided using
     * a switch statement.
     *
     * @param args contains the functionality to be executed and the required
     *             arguments for each execution path.
     */
    public static void main(final String[] args) {

        final String functionality = args[0];

        switch (functionality) {
            case Constants.HELLO_WORLD:
                HelloWorld.writeHelloWorld();
                break;
            case Constants.ANAGRAMS:
                if (StringAlgorithms.checkStringsAreAnagrams(args[1], args[2])) {
                    System.out.println("Strings " + args[1] + " and " + args[2] + " are anagrams.");
                } else {
                    System.out.println("Strings " + args[1] + " and " + args[2] + " are NOT anagrams.");
                }
                break;
            case Constants.PALINDROME:
                if (StringAlgorithms.checkStringIsPalindrome(args[2])) {
                    System.out.println("String " + args[2] + " is a palindrome.");
                } else {
                    System.out.println("String " + args[2] + " is NOT a palindrome.");
                }
                break;
            default:
                System.out.println("Sorry, no functionality was selected :)");
        }

    }

}
