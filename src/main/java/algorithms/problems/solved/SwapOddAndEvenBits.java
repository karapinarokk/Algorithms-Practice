package algorithms.problems.solved;

import java.util.Scanner;

import static algorithms.constants.ApplicationConstants.PROBLEMS_GENERAL_EXPLANATION;

public class SwapOddAndEvenBits {


    private static final String EXPLANATION = "Given an unsigned integer N. The task is to swap all odd bits with even bits. For example, if the given number is 23 (00010111), it should be converted to 43(00101011). Here, every even position bit is swapped with adjacent bit on right side(even position bits are highlighted in binary representation of 23), and every odd position bit is swapped with adjacent on left side.\n" +
            "\n" +
            "Input:\n" +
            "The first line of input contains T, denoting the number of testcases. Each testcase contains single line.\n" +
            "\n" +
            "Output:\n" +
            "For each testcase in new line, print the converted number.\n" +
            "\n" +
            "Constraints:\n" +
            "1 ≤ T ≤ 100\n" +
            "1 ≤ N ≤ 100\n" +
            "\n" +
            "Example:\n" +
            "Input:\n" +
            "2\n" +
            "23\n" +
            "2\n" +
            "\n" +
            "Output:\n" +
            "43\n" +
            "1\n" +
            "\n" +
            "Explanation:\n" +
            "Testcase 1: BInary representation of the given number; 00010111 after swapping 00101011.";

    public SwapOddAndEvenBits() {
        System.out.println(PROBLEMS_GENERAL_EXPLANATION + EXPLANATION);
        System.out.println("\n");
        System.out.println("Please write T variable");

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {

            System.out.println("Please write n variable");
            int n = sc.nextInt();

            int odd = (n & 0x55555555) * 2;
            int even = (n & 0xAAAAAAAA) / 2;
            int num = even | odd;
            System.out.println(num);
        }
    }
}
