package OfficeDay01;

public class ReverseWord {

    public static String wordReverse(String word)
    {
        return new StringBuilder(word).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(ReverseWord.wordReverse("virtusa"));
    }
}
