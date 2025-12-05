package DailyGit;

import java.math.BigInteger;
import java.util.List;

public class PrimeNumberList {

    public static List<Integer> primeList(List<Integer> list)
    {
        List<Integer> outputList = list
                .stream()
                .filter(n-> BigInteger.valueOf(n).isProbablePrime(n))
                .toList();

        return outputList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1,2,3,4,5,6,7,9,11,13,15,17);
        System.out.println(PrimeNumberList.primeList(inputList));
    }
}
