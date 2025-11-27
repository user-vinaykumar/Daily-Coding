package PracticeCodes;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumbers {

    public static List<Integer> missingNumbers(List<Integer> list)
    {
        if(list == null || list.isEmpty()) return Collections.emptyList();

        List<Integer> outputList = new ArrayList<>();
        Set<Integer> set = new HashSet<>(list);

        int min = Collections.min(set);
        int max = Collections.max(set);

        return IntStream.range(min, max).filter(i -> !set.contains(i))
                .boxed().collect(Collectors.toList());

    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 9));
        System.out.println(MissingNumbers.missingNumbers(inputList));
    }
}
