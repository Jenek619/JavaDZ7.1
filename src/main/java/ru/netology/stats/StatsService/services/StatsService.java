package ru.netology.stats.StatsService.services;

public class StatsService {

    public int AllSales(long[] sales) {
        int AllMonth = 0;
        for (long sale : sales) {
            AllMonth += sale;
        }
        return AllMonth;
    }

    public int MidSales(long[] sales) {
        int AllSumSales = 0;
        int MidSumMonth = 0;

        MidSumMonth = AllSales(sales);
        AllSumSales = MidSumMonth / sales.length;

        return AllSumSales;
    }

    public int MaxSales(long[] sales) {
        int MaxMonthSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[MaxMonthSales]) {
                MaxMonthSales = i;
            }
        }

        return MaxMonthSales + 1;
    }

    public int MinSales(long[] sales) {
        int MinMonthSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[MinMonthSales]) {
                MinMonthSales = i;
            }
        }

        return MinMonthSales + 1;
    }

    public int UnderMidSales(long[] sales) {
        int MidSum = MidSales(sales);
        int UnderMidSum = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < MidSum) {
                UnderMidSum = UnderMidSum + 1;
            }
        }
        return UnderMidSum;
    }

    public int MaxMidSales(long[] sales) {
        int MidSum = MidSales(sales);
        int MaxMidSum = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > MidSum) {
                MaxMidSum = MaxMidSum + 1;
            }
        }
        return MaxMidSum;
    }


}
