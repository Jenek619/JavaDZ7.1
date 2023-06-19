package ru.netology.stats.StatsService.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldAllSales() {
        StatsService service = new StatsService();

        long[] AllSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        long actual = service.AllSales(AllSales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldMidSalesMonth() {
        StatsService service = new StatsService();

        long[] MidSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.MidSales(MidSales);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldMaxSalesMonth() {
        StatsService service = new StatsService();

        long[] MaxSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.MaxSales(MaxSales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinSalesMonth() {
        StatsService service = new StatsService();

        long[] MinSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.MinSales(MinSales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUnderMidSales() {
        StatsService service = new StatsService();

        long[] UnderMidSum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.UnderMidSales(UnderMidSum);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxMidSales() {
        StatsService service = new StatsService();

        long[] MaxMidSum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.MaxMidSales(MaxMidSum);

        Assertions.assertEquals(expected, actual);

    }
}

