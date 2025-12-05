package DailyGit;

import java.util.List;

public class EvenNumberList {

    public static List<Integer> evenNumber(List<Integer> list)
    {
        List<Integer> outputList = list
                .stream()
                .filter(n->n%2==0)
                .toList();

        return outputList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1,2,3,4,5,6,7,8,9,0);
        System.out.println(EvenNumberList.evenNumber(inputList));
    }
}
