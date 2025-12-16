package SeriousDay;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class StringLengthMap {
    public static Map<String, Integer> stringLengthMap(List<String> word) {
        Map<String, Integer> map = word
                .stream()
                .collect(Collectors.toMap(c -> c, String::length));

        return map;
    }

    public static void main(String[] args) {
        List<String> inputList = List.of("vinay", "12f", "hsajdjd", "dkdhsys");
        System.out.println(StringLengthMap.stringLengthMap(inputList));

    }
}