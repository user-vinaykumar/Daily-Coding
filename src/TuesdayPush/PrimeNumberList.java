package TuesdayPush;

import java.math.BigInteger;
import java.util.List;

public class PrimeNumberList {

    public static List<Integer> primeList(List<Integer> list)
    {
        return list
                .stream()
                .filter(n-> BigInteger.valueOf(n).isProbablePrime(n))
                .toList();
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 2, 4, 5, 6, 7, 8, 9, 0, 11, 12, 13, 14, 15, 16,17);
        System.out.println(PrimeNumberList.primeList(inputList));
    }
}
