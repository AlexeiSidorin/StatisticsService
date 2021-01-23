package ru.netology.stats;

public class StatsMethod {

    public int sumTotal(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
                sum += arr[i];
        }
        return sum;
    }

    public int average(int[] arr){
        int avg = sumTotal(arr)/arr.length;
        return avg;

    }

    public int searchMax(int[] arr){
        int max = arr[0];
        int count = 0;
        int maxMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            if (arr[i] >= max) {
                max = arr[i];
                maxMonth = count;
            }
        }
        return maxMonth;

    }

    public int searchMin(int[] arr){
        int min = arr[0];
        int count = 0;
        int minMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            if (min > arr[i]) {
                min = arr[i];
                minMonth = count;
            }
        }
        return minMonth;

    }

    public  int searchUnderAvg(int[] money) {
        int avg = average(money);
        int month = 0;
        int numb = 0;
        for (int moneys : money) {
            if (moneys < avg) {
                month++;
                numb = month;
            }
        }
        return numb;
    }

    public int searchOverAvg(int[] money) {
        int avg = average(money);
        int month = 0;
        int numb = 0;
        for (int moneys : money) {
            if (moneys > avg) {
                month++;
                numb = month;
            }
        }
        return numb;
    }
}
