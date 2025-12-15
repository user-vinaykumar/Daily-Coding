package SeriousDay;

public class StringReverse {

    public static String wordReverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(StringReverse.wordReverse("virtusa"));
    }
}
