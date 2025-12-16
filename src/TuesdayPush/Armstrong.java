package TuesdayPush;

import jdk.jshell.execution.JdiDefaultExecutionControl;

import java.math.BigInteger;

public class Armstrong {

    public static void armstrong(BigInteger number)
    {
        String str = String.valueOf(number);
        int exponent = str.length();
        BigInteger sum = BigInteger.ZERO;

        for(char c : str.toCharArray())
        {
            int digit = c - '0';
            BigInteger bigInteger = BigInteger.valueOf(digit);
            sum = sum.add(bigInteger.pow(exponent));
        }
        if(sum.equals(number))
        {
            System.out.println("the given number is an armstrong number");
        }
        else
        {
            System.out.println("the given number is not an armstrong number");
        }
    }

    public static void main(String[] args) {
        Armstrong.armstrong(BigInteger.valueOf(153));
    }
}
