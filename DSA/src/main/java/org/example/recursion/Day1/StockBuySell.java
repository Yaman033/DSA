package org.example.recursion.Day1;

public class StockBuySell {

    public void stockBuySell(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        int sell = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }
            else{
                if (profit < prices[i] -buy) {
                    profit = prices[i] - buy;
                    return;
                }
            }

            }
        if (profit == 0) {
            return;
        }
    }
}
