package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMaxMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMinMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateTotalAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAmount = 180;
        long actualAmount = service.calculateTotalAmount(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldCalculateAverageAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAmount = 15;
        double actualAmount = service.calculateAverageAmount(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldFindMonthsBellowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateBellowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldFindMonthsAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

}
