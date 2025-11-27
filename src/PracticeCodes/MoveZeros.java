package PracticeCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeros {

    public static List<Integer> moveZeros(List<Integer> list)
    {
        int count = 0;
        List<Integer> zeroMoved = new ArrayList<>();
        for(int num : list)
        {
            if(num ==0) count++;
            else zeroMoved.add(num);
        }
        while (count-- > 0)
        {
            zeroMoved.add(0);
        }
        return zeroMoved;
    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 0, 4, 0, 5, 2, 0, 7, 7));
        System.out.println(MoveZeros.moveZeros(inputList));
    }
}
