package GitCodePushDay;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class PalindromeWOSB {

    public static boolean isPalindromewosb(String word)
    {
        Deque<Character> stack = word
                .chars()
                .mapToObj(c->(char)c)
                .collect(ArrayDeque::new,
                        Deque::push,
                        Deque::addAll);
        String reverseWord = stack
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        return reverseWord.equals(word);
    }

    public static void main(String[] args) {
        if(PalindromeWOSB.isPalindromewosb("malayalam")) {
            System.out.println("The string you entered is a Palindrome");
        }
        else
        {
            System.out.println("The String you entered is not a Palindrome");
        }
    }
}
