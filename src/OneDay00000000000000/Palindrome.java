package OneDay00000000000000;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class Palindrome {

    public static boolean isPalindrome(String word) {
        Deque<Character> stack = word
                .chars()
                .mapToObj(c -> (char) c)
                .collect(ArrayDeque::new, Deque::push, Deque::addAll);

        String str = stack
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        return str.equals(word);
    }

    public static void main(String[] args) {
        if (Palindrome.isPalindrome("malayalam")) {
            System.out.println("the string provided is a Palindrome");
        } else {
            System.out.println("the string provided is not a Palindrome");
        }
    }
}
