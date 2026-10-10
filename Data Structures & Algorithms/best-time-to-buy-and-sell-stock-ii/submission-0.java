class Solution {
    public int maxProfit(int[] prices) {

    
    
    int cost=0;
   
    for(int j=1;j<prices.length;j++)
    {
        if(prices[j]>prices[j-1])
        cost+=(prices[j]-prices[j-1]);
        
        
    }
    
        return  cost;
    }
}