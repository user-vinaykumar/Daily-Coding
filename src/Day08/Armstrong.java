package Day08;

import java.math.BigInteger;
import java.util.Arrays;

public class Armstrong {

    public static boolean armstrong(BigInteger number)
    {
        String str = String.valueOf(number);
        int exponential = str.length();
        BigInteger sum = BigInteger.ZERO;
        for(char c : str.toCharArray())
        {
            int digit = c - '0';
            BigInteger bigInteger = BigInteger.valueOf(digit);
            sum = sum.add(bigInteger.pow(exponential));
        }
        return sum.equals(number);
    }


    public static void main(String[] args) {
        BigInteger input = BigInteger.valueOf(153);
        if(Armstrong.armstrong(input))
        {
            System.out.println("The provided number is an Armstrong Number");
        }
        else {
            System.out.println("The provided number is not an Armstrong Number");
        }
    }
}
