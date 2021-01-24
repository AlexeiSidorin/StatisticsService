package ru.netology.stats;

public class StatisticsService {

    public static void main(String[] args) {

        int[] money = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int total = sumTotal(money);
        System.out.println(total);

        int avg = average(money);
        System.out.println(avg);

        int max = searchMax(money);
        System.out.println(max);

        int min = searchMin(money);
        System.out.println(min);

        int minAvg = searchUnderAvg(money);
        System.out.println(minAvg);

        int maxAvg = searchOverAvg(money);
        System.out.println(maxAvg);




    }

    public static int sumTotal(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int average(int[] arr){
        int avg = sumTotal(arr)/arr.length;
        return avg;

    }

    public static int searchMax(int[] arr){
        int max = arr[0];
        int count = 0;
        int maxMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            if (arr[i] > max) {
                max = arr[i];
                maxMonth = count;
            }
        }
        return maxMonth;

    }

    public static int searchMin(int[] arr){
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

    public  static int searchUnderAvg(int[] money) {
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

    public static int searchOverAvg(int[] money) {
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
