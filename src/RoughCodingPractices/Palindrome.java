package RoughCodingPractices;

public class Palindrome
{
    public static boolean isPlaindrome(String word)
    {
        String term = String.valueOf(word);
        return term.equals(new StringBuilder(term).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPlaindrome("virtusa"));
    }

}
