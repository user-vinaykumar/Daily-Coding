package Workoholic;

import java.math.BigInteger;

public class Armstrong {

    public static boolean armstrong(BigInteger number)
    {
        String str = String.valueOf(number);
        int exponential = str.length();
        BigInteger sum = BigInteger.ZERO;

        for(char c : str.toCharArray())
        {
            int digit = c -'0';
            BigInteger bigInteger = BigInteger.valueOf(digit);
            sum = sum.add(bigInteger.pow(exponential));
        }
        return sum.equals(number);
    }

    public static void main(String[] args) {
        BigInteger input = BigInteger.valueOf(153);

        if(Armstrong.armstrong(input)) System.out.println("the number is armstrong");
        else System.out.println("the number is not armstrong");
    }
}
