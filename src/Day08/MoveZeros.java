package Day08;

import java.util.ArrayList;
import java.util.List;

public class MoveZeros {

    public static List<Integer> moveZeros(List<Integer> list)
    {
       List<Integer> outputList = new ArrayList<>();
       int count = 0;
       for(int num : list)
       {
           if(num!=0) outputList.add(num);
           else count++;
       }
       while(count-- > 0)
       {
           outputList.add(0);
       }
       return outputList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 2, 0, 7, 8, 0, 5, 0, 0, 0, 7, 7);
        System.out.println(MoveZeros.moveZeros(inputList));
    }
}
