public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1 – Welcome message
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Version 2.0");

        // UC2 – Hardcoded palindrome check
        String word = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println(word + " is a Palindrome");
        else
            System.out.println(word + " is NOT a Palindrome");
    }
}