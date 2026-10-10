class Solution {
    public int characterReplacement(String s, int k) {

      int []freq=new int[26];
    int l=0;
    int r=0;
    int maxfreq=0;
    int maxsize=0;
    for(r=0;r<s.length();r++)
    {
        freq[s.charAt(r)-'A']++;
        maxfreq=Math.max(maxfreq,freq[s.charAt(r)-'A']);
        int size=r-l+1;
        if(size-maxfreq>k)
        {
            freq[s.charAt(l)-'A']--;
            l++;
        }
        size=r-l+1;
        maxsize=Math.max(maxsize,size);
    }

return maxsize;
          
        
    }
}
