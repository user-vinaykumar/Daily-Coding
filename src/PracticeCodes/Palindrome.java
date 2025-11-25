package PracticeCodes;

public class Palindrome {

    public static boolean isPalindrome(String word)
    {
        String result = String.valueOf(word);
        return result.equals(new StringBuilder(result).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("virtusa"));
        System.out.println(Palindrome.isPalindrome("malayalam"));
    }
}
