class Solution {
    public void reverseString(char[] s) {
    
    int j=s.length-1;
    char temp=' ';
    for(int i=0;i<=s.length/2;i++)
    {
        if(j>=s.length/2 && i!=j)
        {
           temp=s[i];
           s[i]=s[j];
           s[j]=temp;
        }
        j--;

    }
        
    }
}