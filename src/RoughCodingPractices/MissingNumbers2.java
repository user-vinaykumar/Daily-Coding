package RoughCodingPractices;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumbers2 {

    public static List<Integer> missingNumbers2(List<Integer> list) {
        if (list == null || list.isEmpty()) return Collections.emptyList();

        List<Integer> missing = new ArrayList<>();
        Set<Integer> set = new HashSet<>(list);

        int min = Collections.min(set);
        int max = Collections.max(set);

        return IntStream.range(min, max).filter(i -> !set.contains(i)).boxed().
                collect(Collectors.toList());


    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 8, 2, 9, 1, 7, 7));
        System.out.println(MissingNumbers.missingNumber(inputList));
    }
}
