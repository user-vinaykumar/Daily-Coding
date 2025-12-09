package GitCodePushDay;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumbers {

    public static List<Integer> missingNumbers(List<Integer> list) {
        List<Integer> uniqueSortedList = list
                .stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        int min = Collections.min(uniqueSortedList);
        int max = Collections.max(uniqueSortedList);

        return IntStream.range(min, max)
                .filter(n -> !uniqueSortedList.contains(n))
                .boxed()
                .toList();
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(0, 1, 20);
        System.out.println(MissingNumbers.missingNumbers(inputList));
    }
}
