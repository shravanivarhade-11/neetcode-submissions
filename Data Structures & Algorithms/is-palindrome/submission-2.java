class Solution {
    public boolean isPalindrome(String s) {
        String snew=s.toLowerCase();
        char []ch=snew.toCharArray();
        StringBuilder str=new StringBuilder();
        StringBuilder strrev=new StringBuilder();
        for(int i=snew.length()-1;i>=0;i--)
        {
            if((ch[i]>='a'&& ch[i]<='z') || (ch[i]>='0' && ch[i]<='9'))
            {

            strrev.append(ch[i]);
            }
        }
        for(int i=0;i<snew.length();i++)
        {
            if(ch[i]>='a'&& ch[i]<='z')
            {

            str.append(ch[i]);
            }
        }
        return str.toString().equals(strrev.toString());
    }
}
