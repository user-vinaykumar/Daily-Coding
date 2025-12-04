package GitPushes;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class MissingNumbers {

    public static List<Integer> missingNumberList(List<Integer> list)
    {
        List<Integer> outputList = list.stream().distinct().sorted().toList();
        int min = Collections.min(outputList);
        int max = Collections.max(outputList);
        return IntStream.range(min, max).filter(n->!outputList.contains(n)).boxed()
                .toList();
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 19);
        System.out.println(MissingNumbers.missingNumberList(inputList));
    }
}
