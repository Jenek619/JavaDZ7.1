package ru.netology.stats.StatsService.services;

public class StatsService {

    public int allsales(long[] sales) {
        int allmonth = 0;
        for (long sale : sales) {
            allmonth += sale;
        }
        return allmonth;
    }

    public int midsales(long[] sales) {
        int allsumsales = 0;
        int midsummonth = 0;

        midsummonth = allsales(sales);
        allsumsales = midsummonth / sales.length;

        return allsumsales;
    }

    public int maxsales(long[] sales) {
        int maxmonthsales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxmonthsales]) {
                maxmonthsales = i;
            }
        }

        return maxmonthsales + 1;
    }

    public int minsales(long[] sales) {
        int minmonthsales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minmonthsales]) {
                minmonthsales = i;
            }
        }

        return minmonthsales + 1;
    }

    public int undermidsales(long[] sales) {
        int midsum = midsales(sales);
        int undermidsum = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < midsum) {
                undermidsum = undermidsum + 1;
            }
        }
        return undermidsum;
    }

    public int maxmidsales(long[] sales) {
        int midsum = midsales(sales);
        int maxmidsum = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > midsum) {
                maxmidsum = maxmidsum + 1;
            }
        }
        return maxmidsum;
    }


}
