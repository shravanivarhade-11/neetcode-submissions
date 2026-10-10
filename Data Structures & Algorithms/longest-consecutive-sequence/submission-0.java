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
        if(!seen.contains(num-1))
        {
            currnum=num;
            streak=1;

            while(seen.contains(currnum+1))
            {
                currnum++;
                streak++;
            }
             maxstreak=Math.max(maxstreak,streak);
        }
       

    }
    return maxstreak;
    


     
        
    }
}
