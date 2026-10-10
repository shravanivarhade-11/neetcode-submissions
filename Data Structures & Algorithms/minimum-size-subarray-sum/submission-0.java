class Solution {
    public int minSubArrayLen(int target, int[] nums) {
          int sum=0;
        int lengt=nums.length;
        for(int k=0;k<nums.length;k++)
        {
            sum+=nums[k];
            
        }
        if(sum<target)
        return 0;

        for(int i=0;i<nums.length;i++)
        {
            sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum>=target)
                {
                    lengt=Math.min(lengt,j-i+1);
                }
                
            }
            
        }
        return lengt;
        
    }
}