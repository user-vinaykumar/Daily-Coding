package RoughCodingPractices;

import java.util.*;
import java.util.stream.Collectors;

public class MissingNumbers {

    public static List<Integer> missingNumber(List<Integer> list)
    {
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> set = list.stream().collect(Collectors.toSet());
        for(int i = Collections.min(set); i < Collections.max(set); i ++)
        {
            if(!set.contains(i))
            {
                list2.add(i);
            }
        }
        return list2;
    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 8, 2, 9, 1, 7, 7));
        System.out.println(MissingNumbers.missingNumber(inputList));

    }
}
