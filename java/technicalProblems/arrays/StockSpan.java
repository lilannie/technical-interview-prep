package technicalProblems.arrays;

import util.Printing;

public class StockSpan {

    public static int[] findStockSpan(int[] arr) {
        int[] stockSpan = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            stockSpan[i] = 1;

            int currentDay = i - 1;
            int max = -1;

            while(currentDay >= 0 && arr[currentDay] < arr[i]) {
                if(arr[currentDay] >= max) {
                    stockSpan[i] += stockSpan[currentDay];
                    max = arr[currentDay];
                }

                currentDay--;
            }
        }

        return stockSpan;
    }

    public static void main(String args[]) {
        int[] arr = new int[]{100, 80, 60, 70, 60, 75, 85};
        int[] stockSpan = findStockSpan(arr);

        Printing.printArray(stockSpan);

        arr = new int[]{10, 4, 5, 90, 120, 80};
        stockSpan = findStockSpan(arr);

        Printing.printArray(stockSpan);
    }
}
