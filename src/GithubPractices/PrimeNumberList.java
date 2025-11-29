package GithubPractices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumberList {

    public static List<Integer> primeNumberList(List<Integer> list)
    {
        List<Integer> outputList = new ArrayList<>();
        for(int num : list)
        {
            if(BigInteger.valueOf(num).isProbablePrime(num)) outputList.add(num);
        }
        return outputList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 13, 17));
        System.out.println(PrimeNumberList.primeNumberList(inputList));
    }

}
