package VinayGitPush;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class MissingNumbers {

    public static List<Integer> missingNumberList(List<Integer> list) {
        List<Integer> uniqueSortedList = list
                .stream()
                .distinct()
                .sorted()
                .toList();

        int min = Collections.min(uniqueSortedList);
        int max = Collections.max(uniqueSortedList);

        return IntStream.range(min, max)
                .filter(n -> !uniqueSortedList.contains(n))
                .boxed()
                .toList();
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 2, 4, 5, 199);
        System.out.println(MissingNumbers.missingNumberList(inputList));
    }
}
