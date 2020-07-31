package algorithms.provider;

import algorithms.constants.ApplicationConstants;
import algorithms.logger.ApplicationBeautifyLogHandler;

import java.util.ArrayList;
import java.util.Collections;
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

        System.out.println("### Welcome to Algorithm Practice Application ###");

        List<String> algorithmNames = new ArrayList<>(Collections.singleton("MoneyAlgorithm"));
        System.out.println("Please select an algorithm below to keep continue..");
        algorithmNames.forEach(System.out::println);

        Scanner sc = new Scanner(System.in);

        String t = sc.next();

        this.executeAlgorithm(t);

    }
}
