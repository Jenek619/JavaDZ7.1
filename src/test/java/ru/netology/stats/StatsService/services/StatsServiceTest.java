package ru.netology.stats.StatsService.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldAllSales() {
        StatsService service = new StatsService();

        long[] allsales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        long actual = service.allsales(allsales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldMidSalesMonth() {
        StatsService service = new StatsService();

        long[] midsales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.midsales(midsales);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldMaxSalesMonth() {
        StatsService service = new StatsService();

        long[] maxsales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxsales(maxsales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinSalesMonth() {
        StatsService service = new StatsService();

        long[] minsales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minsales(minsales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUnderMidSales() {
        StatsService service = new StatsService();

        long[] undermidsum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.undermidsales(undermidsum);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxMidSales() {
        StatsService service = new StatsService();

        long[] maxmidsum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.maxmidsales(maxmidsum);

        Assertions.assertEquals(expected, actual);

    }
}

