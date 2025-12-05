package DailyGit;

import java.util.List;

public class RemoveDuplicatesWithoutSet {

    public static List<Integer> removeDuplicatesWISet(List<Integer> list)
    {
        return list.stream()
                .distinct()
                .toList();
    }


    public static void main(String[] args) {
     List<Integer> inputList = List.of(1, 2, 2, 3, 4, 5, 5, 6, 6, 7, 7, 7, 8);
        System.out.println(RemoveDuplicatesWithoutSet.removeDuplicatesWISet(inputList));
    }
}
