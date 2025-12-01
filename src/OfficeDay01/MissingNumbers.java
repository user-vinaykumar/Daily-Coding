package OfficeDay01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumbers {

    public static List<Integer> missingNumbers(List<Integer> list)
    {
        if(list == null || list.isEmpty()) return Collections.emptyList();

        List<Integer> uniqueSortedList = list.stream().distinct().sorted().toList();

        int min = Collections.min(uniqueSortedList);
        int max = Collections.max(uniqueSortedList);

        return IntStream.range(min, max).filter(n-> !uniqueSortedList.contains(n))
                .boxed().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 19);
        System.out.println(MissingNumbers.missingNumbers(inputList));
    }
}
