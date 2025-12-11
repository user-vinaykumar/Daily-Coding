package OneDay00000000000000;

public class StringReverse {

    public static String stringReverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(StringReverse.stringReverse("virtusa"));
    }
}
