package PracticeDay03;
import PracticeDay03.WordReverse;

public class Palindrome {

    public static boolean isPalindrome(String word){
        String term = String.valueOf(word);
        return term.equals(WordReverse.wordReverse(term));
    }


    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Virtusa"));
        System.out.println(Palindrome.isPalindrome("malayalam"));
    }
}
