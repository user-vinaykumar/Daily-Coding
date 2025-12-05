package DailyGit;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(List<Integer> list)
    {
        List<Integer> outputList = new ArrayList<>();
        for(int num : list)
        {
            if(!outputList.contains(num))
            {
                outputList.add(num);
            }
        }
        return outputList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 2, 2, 3, 4, 5, 5, 6, 6, 7, 7, 7, 8);
        System.out.println(RemoveDuplicates.removeDuplicates(inputList));
    }
}
