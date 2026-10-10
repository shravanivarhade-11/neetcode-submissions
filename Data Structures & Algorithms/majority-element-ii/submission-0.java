class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer,Integer> freq=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>(); 
        int n=nums.length/3;
        for(int num:nums)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry:freq.entrySet())
        { 
            if(entry.getValue()>n)
            {
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}