package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }
    public long aver(long[] purchases) {
        return calculateSum(purchases) / purchases.length;

    }

    public long findMax(long[] purchases) {
        long currentMax = purchases[0];
        for (long purchase : purchases) {
            if (currentMax < purchase) {
                currentMax = purchase;
            }
        }
        return currentMax;
    }

    public int monthWithMax(long[] purchases) {
        long max = getMax(purchases);
        int month = 1;
        int monthWithMax = 0;
        for (long purchase : purchases) {
            if (purchase == max) {
                monthWithMax = month;
                }
            month = month +1;
        }
        return monthWithMax;
    }

    public long getMax(long[] purchases) {
        long max = purchases[0];
        for (long purchase : purchases) {
            if (purchase > max) {
                max = purchase;
            }
        }
        return max;
    }
    public long getMin(long[] purchases) {
        long min = purchases[0];
        for (long purchase : purchases) {
            if (purchase < min) {
                min = purchase;
            }
        }
        return min;
    }
    public int monthWithMin(long[] purchases) {
        long min = getMin(purchases);
        int month = 1;
        int monthWithMin = 0;
        for (long purchase : purchases) {
            if (purchase == min) {
                monthWithMin = month;
            }
            month = month +1;
        }
        return monthWithMin;
    }
    public int monthCountMoreThenAver(long[] purchases) {
        long aver = aver(purchases);
        int count = 0;
        for (long purchase : purchases) {
            if (purchase > aver) {
                count = count + 1;
            }
        }
        return count;
    }
    public int monthCountLessThenAver(long[] purchases) {
        long aver = aver(purchases);
        int count = 0;
        for (long purchase : purchases) {
            if (purchase < aver) {
                count = count +1;
            }
        }
        return count;
    }
}



