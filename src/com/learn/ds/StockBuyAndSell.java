package com.learn.ds;

import java.util.ArrayList;
import java.util.List;

public class StockBuyAndSell {
    static class Stock {
        int buy;
        int sell;
    }

    public static void main(String[] args) {
        int A[] = {4,2,2,2,4};
        List<Stock> stocks = new ArrayList<>();
        for (int i = 1; i < A.length; ) {
            if (A[i - 1] < A[i] ) {
                int j = i - 1;
                while (i < A.length && A[i - 1] < A[i]) {
                    i++;
                }
                int k = i - 1;
                Stock stock=new Stock();
                stock.buy=j;
                stock.sell=k;
                stocks.add(stock);
            }else{
                i++;
            }
        }
        System.out.println(stocks);
    }
}
