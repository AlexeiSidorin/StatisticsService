package ru.netology.stats;

public class StatisticsService {

    public static void main(String[] args) {

        int[] money = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsMethod method = new StatsMethod();

        int total = method.sumTotal(money);
        System.out.println(total);

        int avg = method.average(money);
        System.out.println(avg);

        int max = method.searchMax(money);
        System.out.println(max);

        int min = method.searchMin(money);
        System.out.println(min);

        int minAvg = method.searchUnderAvg(money);
        System.out.println(minAvg);

        int maxAvg = method.searchOverAvg(money);
        System.out.println(maxAvg);



    }





}
