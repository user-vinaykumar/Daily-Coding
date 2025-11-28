package Day08;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class Palindrome {

    public static boolean isPalindrome(String word)
    {
        String term = String.valueOf(word);
        return term.equals(new StringBuilder(term).reverse().toString());
    }


    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("virtusa"));
        System.out.println(Palindrome.isPalindrome("malayalam"));
    }
}
