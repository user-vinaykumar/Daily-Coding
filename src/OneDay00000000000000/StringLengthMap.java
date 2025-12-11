package OneDay00000000000000;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringLengthMap {

    public static Map<String, Integer> stringLengthMap(List<String> list) {
        Map<String, Integer> map = list
                .stream()
                .collect(Collectors.toMap(s -> s, String::length));

        return map;
    }

    public static void main(String[] args) {
        List<String> inputList = List.of("vinay", "pavan", "rohan", "vijay", "praveen", "akash");
        System.out.println(StringLengthMap.stringLengthMap(inputList));
    }
}
