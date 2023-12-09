package ru.netology.stats;

public class StatsService {

    public int findMaxMonth(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int findMinMonth(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public long calculateTotalAmount(long[] sales) {
        long totalAmount = 0;

        for (long i : sales) {
            totalAmount += i;
        }
        return totalAmount;
    }

    public double calculateAverageAmount(long[] sales) {
        long totalAmount = calculateTotalAmount(sales);
        double average = totalAmount / sales.length;
        return average;

    }

    public int calculateBellowAverage(long[] sales) {

        double average = calculateAverageAmount(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;

    }

    public int calculateAboveAverage(long[] sales) {
        double average = calculateAverageAmount(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }
        return count;

    }

}