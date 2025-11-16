package CodingQuestions;


public class WordReverse {
    public static String wordReverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }


    public static void main(String[] args) {

        System.out.println(WordReverse.wordReverse("virtusa"));

    }


}
