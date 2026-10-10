class Solution {
    public int maxProfit(int[] prices) {
        int cost=0;
        for(int L=0;L<prices.length;L++)
        {
            for(int R=L+1;R<prices.length;R++)
            {
                if(R>L)
                {
                    int diff=prices[R]-prices[L];
                    cost=Math.max(cost,diff);
                }
            }
        }
        return cost;
        
    }
}
