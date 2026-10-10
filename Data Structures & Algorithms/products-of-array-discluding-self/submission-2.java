class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []prod=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            prod[i]=1;
            
            for(int j=0;j<nums.length;j++)
            {
                

                if (i != j) {

                    prod[i] *= nums[j];

                }
                
                
            }
        }
        return prod;
    }
}  
