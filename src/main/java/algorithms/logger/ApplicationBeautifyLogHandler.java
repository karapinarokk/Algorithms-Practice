package algorithms.logger;

import java.util.Objects;

public class ApplicationBeautifyLogHandler {

    public void logFiveBlank() {
        for (int i = 0; i < getRandomIntegerBetweenRange(2, 4); i++) {
            System.out.println(getRandomSharp(getRandomIntegerBetweenRange(10, 50)) + "\n");
        }
    }

    private String getRandomSharp(double randomIntegerBetweenRange) {
        StringBuilder sharpBuilder = new StringBuilder("#");
        for (int i = 0; i < randomIntegerBetweenRange; i++) {
            Objects.requireNonNull(sharpBuilder).append("#");
        }
        return sharpBuilder.toString();
    }

    public static double getRandomIntegerBetweenRange(double min, double max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }
}
