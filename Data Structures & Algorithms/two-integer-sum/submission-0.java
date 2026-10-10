class Solution {
    public int[] twoSum(int[] nums, int target) {

    HashMap<Integer,Integer> integer=new HashMap<>();
    for(int i=0;i<nums.length;i++)
    {
        integer.put(nums[i],i);
    }

    for(int i=0;i<nums.length;i++)
    {
        int diff=target-nums[i];
        if(integer.containsKey(diff) && integer.get(diff)!=i)
        {
            return new int[]{i,integer.get(diff)};
        }
    }
    return new int[0];

        
    }
}
