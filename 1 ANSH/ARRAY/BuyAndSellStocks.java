package Array.Easy;

public class BuyAndSellStocks {

    public static int stocks(int prices[]){
        int maxProfit =0;
        int BuyingPrice = Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            if(BuyingPrice < prices[i]){
                int profit = prices[i] - BuyingPrice; //today's Profit
                maxProfit = Math.max(maxProfit, profit);
            }else{
                BuyingPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(stocks(prices));
    }
}
