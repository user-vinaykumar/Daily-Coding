package Day07;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumbersList {

    public static List<Integer> primeNumberList(List<Integer> list) {
        List<Integer> outputList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (BigInteger.valueOf(list.get(i)).isProbablePrime(list.get(i))) {
                outputList.add(list.get(i));
            }
        }
        return outputList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19));
        System.out.println(PrimeNumbersList.primeNumberList(inputList));
    }
}
