package PracticeDay03;

public class SwapTwoNumbers {

    public static void swapNumbersWith(int a, int b)
    {
        int temp = a;
         a = b;
         b = temp;
        System.out.println("a : "+a+" "+"b : "+b);
    }
    public static void swapNumbersWithout(int a, int b)
    {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a : "+a+" "+"b : "+b);
    }

    public static void main(String[] args) {
        SwapTwoNumbers.swapNumbersWith(4, 6);
        SwapTwoNumbers.swapNumbersWithout(5, 8);
    }
}
