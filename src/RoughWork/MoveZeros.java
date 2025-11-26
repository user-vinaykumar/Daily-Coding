package RoughWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeros {

    public static List<Integer> movingZero(List<Integer> list)
    {
        int zeroCount = 0;
        List<Integer> outputList = new ArrayList<>();
        for(int num : list)
        {
            if(num == 0) zeroCount++;
            else outputList.add(num);
        }
        while (zeroCount-- > 0)
        {
            outputList.add(0);
        }
        return outputList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 3, 0, 5, 0, 6, 0));
        System.out.println(MoveZeros.movingZero(inputList));
    }
}