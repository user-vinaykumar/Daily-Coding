package RoughCodingPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Wordk {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2,3, 1, 4, 6, 6, 7, 5, 5));
        List<Integer> uniqueSorted = list.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(uniqueSorted);
    }
}
