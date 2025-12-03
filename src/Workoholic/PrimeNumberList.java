package Workoholic;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumberList {

    public static List<Integer> primeNumberList(List<Integer> list)
    {
        return list.stream().filter(n-> BigInteger.valueOf(n).isProbablePrime(n))
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 13, 17, 19, 23, 25));
        System.out.println(PrimeNumberList.primeNumberList(inputList));
    }
}
