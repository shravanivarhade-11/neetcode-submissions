class Solution {
    public int characterReplacement(String s, int k) {
   int maxcount=0;
   int maxsize=0;

    for(int l=0;l<s.length();l++)
    {
        HashMap<Character,Integer>count=new HashMap<>();
        maxcount=0;
        for(int r=l;r<s.length();r++)
        {
            count.put(s.charAt(r),count.getOrDefault(s.charAt(r),0)+1);
            maxcount=Math.max(maxcount,count.get(s.charAt(r)));
            int size=r-l+1;
            if(size-maxcount<=k)
            {
                maxsize=Math.max(maxsize,size);
            }
        }
    }
          
        return maxsize;
    }
}
