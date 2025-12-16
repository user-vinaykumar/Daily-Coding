package DecemberPush;

public class Palindrome {

    public static boolean isPalindrome(String word) {
        String str = String.valueOf(word);
        return str.equals(new StringBuilder(str).reverse().toString());
    }


    public static void main(String[] args) {
        if (Palindrome.isPalindrome("virtusa")) {
            System.out.println("the given string is a Palindrome");
        } else {
            System.out.println("the given string is not a Palindrome");
        }
    }
}
