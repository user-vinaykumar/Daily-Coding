package PracticeDay05;

import java.math.BigInteger;

public class ArmStrong {

    public static boolean armstrong(BigInteger number)
    {
        String str = String.valueOf(number);
        int exponential = str.length();
        BigInteger sum = BigInteger.ZERO;

        for(char c : str.toCharArray())
        {
            int digit = c - '0';
            BigInteger bigDigit = BigInteger.valueOf(digit);
            sum = sum.add(bigDigit.pow(exponential));
        }
        return sum.equals(number);
    }

    public static void main(String[] args) {
        BigInteger input = BigInteger.valueOf(111);
        if(armstrong(input))
        {
            System.out.println("given number is an armstrong number");
        }
        else {
            System.out.println("given number is not an armastrong number");
        }
    }
}
