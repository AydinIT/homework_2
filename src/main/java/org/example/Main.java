package org.example;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.23, 4.56, -7.89, 3.14, -2.71, 0.99, -8.88, 5.55, -1.11, 6.97, -3.33, 9.87, -4.56, 7.77, -0.44};
        double sum = 0;
        int count = 0;
        boolean isNegative = false;
        for (double num : numbers) {
            if (num < 0) {
                isNegative = true;
            }
            if (num > 0 && isNegative) {
                sum += num;
                count++;
            }
        }
        System.out.println("Среднее Арифметическое: " + sum / count);
    }
}