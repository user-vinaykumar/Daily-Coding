package GitCodePushDay;

import java.util.List;
import java.util.Optional;

public class SecondLowest {

    public static int secondLowestNumber(List<Integer> list)
    {
        Integer lowest =  list
                .stream()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);

        return lowest;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(SecondLowest.secondLowestNumber(inputList));
    }
}
