class Solution {
    public boolean isPalindrome(String s) {
        String snew=s.toLowerCase().replaceAll("[^a-z0-9]","");
        char []ch=snew.toCharArray();
        StringBuilder str=new StringBuilder();
        for(int i=snew.length()-1;i>=0;i--)
        {
           str.append(ch[i]);
        }
        return snew.equals(str.toString());
    }
}
