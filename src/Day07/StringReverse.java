package Day07;

public class StringReverse {

    public static String reverseString(String word)
    {
        return new StringBuilder(word).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(StringReverse.reverseString("virtusa"));
    }
}
