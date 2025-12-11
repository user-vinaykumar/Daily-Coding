package OneDay00000000000000;

public class Palindrome002 {

    public static boolean isPalindrome(String word) {
        String str = String.valueOf(word);
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(Palindrome002.isPalindrome("virtusa"));
    }
}
