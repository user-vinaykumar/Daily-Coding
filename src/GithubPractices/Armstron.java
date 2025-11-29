package GithubPractices;

import java.math.BigInteger;

public class Armstron {

    public static boolean armStrong(BigInteger number)
    {
        String string = String.valueOf(number);
        int exponential = string.length();
        BigInteger sum = BigInteger.ZERO;
        for(char c : string.toCharArray())
        {
            int digit = c - '0';
            BigInteger bigInteger = BigInteger.valueOf(digit);
            sum = sum.add(bigInteger.pow(exponential));
        }
        return sum.equals(number);
    }

    public static void main(String[] args) {
        BigInteger input = BigInteger.valueOf(112);
        if(Armstron.armStrong(input)) System.out.println("the given number is an armstrong number");
        else System.out.println("the given number is not an armstrong number");
    }
}
