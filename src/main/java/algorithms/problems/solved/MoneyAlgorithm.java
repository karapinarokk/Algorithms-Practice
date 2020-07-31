package algorithms.problems.solved;

import java.util.Scanner;

import static algorithms.constants.ApplicationConstants.PROBLEMS_GENERAL_EXPLANATION;

public class MoneyAlgorithm {

    private final static String EXPLANATION = "Given street of houses (a row of houses), each house having some amount of money kept inside;" +
            "\n now there is a thief who is going to steal this money but he has a constraint/rule that he cannot steal/rob two adjacent houses." +
            "\n Find the maximum money he can rob. + Input: The firstline ofinput containsan integerT denotingthe numberof testcases ." +
            "\n The firstline ofeach test caseis Nand money." +
            "\n OutputPrint maximumoney he can rob." +
            "\n Constraints: " +
            "\n 1 ≤ T ≤ 100 1 ≤money ≤ 100 1 ≤N ≤ 1000 " +
            "\n Example: " +
            "\n Input: 2 5 10 2 12" +
            "\n Output:30 12";

    public MoneyAlgorithm() {

        System.out.println(PROBLEMS_GENERAL_EXPLANATION + EXPLANATION);
        System.out.println("\n");
        System.out.println("Please write T variable");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            System.out.println("Please write n variable");
            int n = sc.nextInt();

            System.out.println("Please write m variable");
            int m = sc.nextInt();
            if (n % 2 != 0) {
                System.out.println((n / 2 + 1) * m);
            } else {
                System.out.println((n / 2) * m);
            }
        }
    }
}
