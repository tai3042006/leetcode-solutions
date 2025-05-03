// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int max = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            if (price - minPrice > max) {
                max = price - minPrice;
            }
        }
        return max;
    }
}
