package OneDay00000000000000;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumbersList {

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
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 2, 3, 4, 15);
        System.out.println(MissingNumbersList.missingNumberList(inputList));
    }
}
