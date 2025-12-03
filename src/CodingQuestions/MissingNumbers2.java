package CodingQuestions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumbers2 {

    public static List<Integer> missingNumber2(List<Integer> list) {
        if (list == null || list.isEmpty()) return Collections.emptyList();


        Set<Integer> set = new HashSet<>(list);

        int min = Collections.min(set);
        int max = Collections.max(set);

        return IntStream.range(min, max).filter(n -> !set.contains(n))
                .boxed().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 3, 9));
        System.out.println(MissingNumbers2.missingNumber2(inputList));
    }
}
