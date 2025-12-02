package RoughCodingPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumber {

    public static List<Integer> missingNumb(List<Integer> list) {
        if (list == null || list.isEmpty()) return Collections.emptyList();

        List<Integer> outputList = new ArrayList<>();
        List<Integer> uniqueSortedList = list.stream().distinct()
                .sorted().collect(Collectors.toList());

        int min = Collections.min(uniqueSortedList);
        int max = Collections.max(uniqueSortedList);

        return IntStream.range(min, max).filter(n -> !uniqueSortedList.contains(n))
                .boxed().collect(Collectors.toList());

    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 9));
        System.out.println(MissingNumber.missingNumb(inputList));
    }
}
