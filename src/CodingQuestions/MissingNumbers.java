package CodingQuestions;

import java.util.*;

public class MissingNumbers {

    public static List<Integer> missingNumbers(List<Integer> list) {
        if (list == null || list.isEmpty()) return Collections.emptyList();

        List<Integer> outputList = new ArrayList<>();
        Set<Integer> set = new HashSet<>(list);

        int min = Collections.min(set);
        int max = Collections.max(set);

        for (int i = min; i < max; i++) {
            if (!list.contains(i)) {
                outputList.add(i);
            }
        }
        return outputList;
    }


    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 9));
        System.out.println(MissingNumbers.missingNumbers(inputList));
    }
}
