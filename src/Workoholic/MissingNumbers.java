package Workoholic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumbers {

    public static List<Integer> missingNumbers(List<Integer> list) {
        List<Integer> outputList = list.stream().distinct().sorted().toList();

        int min = Collections.min(outputList);
        int max = Collections.max(outputList);

        return IntStream.range(min, max)
                .filter(n -> !outputList.contains(n))
                .boxed().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 9));
        System.out.println(MissingNumbers.missingNumbers(inputList));
    }
}
