class Solution {
    public int longestConsecutive(int[] nums) {
    
    HashSet<Integer>seen=new HashSet<>();

    int currnum=0;
    int streak=0;
    int maxstreak=0;
    for(int num:nums)
    {
        seen.add(num);
    }

    for(int num:nums)
    {
        streak=0;
        currnum=num;
        while(seen.contains(currnum))
        {
            streak++;
            currnum++;
        }
        maxstreak=Math.max(streak,maxstreak);

    }
    return maxstreak;
    


     
        
    }
}
