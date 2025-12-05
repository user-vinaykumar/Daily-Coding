package DailyGit;

import java.math.BigInteger;

public class Armstrong {

    public static boolean armstrongNumber(BigInteger number)
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
        BigInteger input = BigInteger.valueOf(123);
        if(Armstrong.armstrongNumber(input))
        {
            System.out.println("the provided number is an Armstrong number");
        }
        else
        {
            System.out.println("the provided number is not an Armstrong Number");
        }
    }
}
