package algorithms.provider;

import algorithms.constants.ApplicationConstants;
import algorithms.logger.ApplicationBeautifyLogHandler;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AlgorithmProvider {

    public void executeAlgorithm(String algorithmName) {

        try {
            Class<?> algorithmClass = Class.forName(ApplicationConstants.GLOBAL_PACKAGE_NAME + algorithmName);
            algorithmClass.newInstance();
        } catch (ClassNotFoundException e) {

            System.out.println("Algorithm does not found Please Try Again");
            this.handleExceptionCasesAndReinitialize();
        } catch (InstantiationException e) {
            System.out.println("Algorithm wrong");
            this.handleExceptionCasesAndReinitialize();

        } catch (IllegalAccessException e) {
            System.out.println("Algorithm does not found illegal access");
            this.handleExceptionCasesAndReinitialize();
        }
    }

    private void handleExceptionCasesAndReinitialize() {
        ApplicationBeautifyLogHandler beautifyLogHandler = new ApplicationBeautifyLogHandler();
        beautifyLogHandler.logFiveBlank();
        this.initializeAlgorithmApplication();
    }


    public void initializeAlgorithmApplication() {

        System.out.println("### Welcome to Algorithm Practice Application ###" + "\n");

        List<String> algorithmNames = Arrays.asList("MoneyAlgorithm", "SwapOddAndEvenBits");

        System.out.println("Please select an algorithm below to keep continue..\n");
        // Algorithm Names
        algorithmNames.forEach(System.out::println);

        System.out.println("\n");

        Scanner sc = new Scanner(System.in);

        String algorithmName = sc.next();

        this.executeAlgorithm(algorithmName);

        this.recursiveEndQuestion(algorithmName);

    }

    private void recursiveEndQuestion(String algorithmName) {

        System.out.println(algorithmName + "algorithm completed. do you wanna continue? y/n");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if ("y".equals(answer)) {
            initializeAlgorithmApplication();
        } else if ("n".equals(answer)) {
            System.out.println("### Thanks - Bye Bye ###" + "\n");
        } else {
            recursiveEndQuestion(algorithmName);
        }

    }
}
