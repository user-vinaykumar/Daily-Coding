package OfficeDay01;

public class Palindrome {

    public static boolean isPalindrome(String word)
    {
        String str = String.valueOf(word);
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("virtusa"));
        System.out.println(Palindrome.isPalindrome("malayalam"));
    }
}
