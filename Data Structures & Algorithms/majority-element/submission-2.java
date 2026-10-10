class Solution {
    public int majorityElement(int[] nums) {
        
        int n=nums.length;
        int max=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
            max=Math.max(max,m.get(nums[i]));
        }

       for(int key:m.keySet())
       {
           if(m.get(key)>n/2)
           {
             return key;
           }
       }
        
return -1;
    }
}