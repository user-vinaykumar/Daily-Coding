package CodingQuestions;

public class SwapTwoNumbers {
    public static void swapNumbers1(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a : " + a + " b : " + b);
    }

    public static void swapNumbers2(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a : " + a + " b : " + b);
    }

    public static void main(String[] args) {
        SwapTwoNumbers.swapNumbers1(10, 15);
        SwapTwoNumbers.swapNumbers2(10, 15);
    }


}
