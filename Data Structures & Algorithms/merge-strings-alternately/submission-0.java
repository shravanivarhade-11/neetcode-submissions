class Solution {
    public String mergeAlternately(String word1, String word2) {
       
        StringBuilder s=new StringBuilder();
        int p=0;
        char []s1=word1.toCharArray();
        char[]s2=word2.toCharArray();
        while(p<Math.min(word1.length(),word2.length()))
        {
            s.append(s1[p]);
            s.append(s2[p]);
            p++;
        }
        if(word1.length()>word2.length())
        {
            for(int i=p;i<word1.length();i++)
            {
                s.append(s1[i]);

            }
        }
        if(word1.length()<word2.length())
        {
            for(int i=p;i<word2.length();i++)
            {
                s.append(s2[i]);
                
            }
        }
        return s.toString();
    }
}