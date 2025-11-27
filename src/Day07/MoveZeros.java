package Day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeros {

    public static List<Integer> moveZeros(List<Integer> list) {
        int count = 0;
        List<Integer> outputList = new ArrayList<>();
        for (int num : list) {
            if (num == 0) count++;
            else outputList.add(num);
        }
        while (count-- > 0) {
            outputList.add(0);
        }
        return outputList;
    }


    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 0, 8, 0, 3, 5));
        System.out.println(MoveZeros.moveZeros(inputList));
    }
}
