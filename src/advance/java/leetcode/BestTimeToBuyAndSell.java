package advance.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,5};
        System.out.println(maxProfit(arr));
    }

    static class BuyAndSell {
        int start;
        int end;

        public BuyAndSell(int i, int j) {
            this.start = i;
            this.end = j;
        }
    }

    public static int maxProfit(int[] prices) {

        int curProfit = 0;
        int curI = -1;
        int i = 1;
        boolean flag = false;
        List<BuyAndSell> buyAndSells = new ArrayList<>();
        while (i < prices.length) {
            if (prices[i] >= prices[i - 1]) {
                if (!flag) {
                    curI = i - 1;
                    flag = true;
                }
            } else {
                if (flag && curI != i) {
                    BuyAndSell buyAndSell = new BuyAndSell(curI, i - 1);
                    buyAndSells.add(buyAndSell);
                }
                flag = false;
            }
            i++;
        }
        if(flag){
            BuyAndSell buyAndSell = new BuyAndSell(curI, i - 1);
            buyAndSells.add(buyAndSell);
        }
        for (BuyAndSell buyAndSell : buyAndSells) {
            curProfit = curProfit + (prices[buyAndSell.end] - prices[buyAndSell.start]);
        }
        return curProfit;

    }
}
