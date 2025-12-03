package Workoholic;

public class ReverseString {

    public static String reverseString(String word)
    {
        return new StringBuilder(word).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(ReverseString.reverseString("virtusa"));
    }
}
