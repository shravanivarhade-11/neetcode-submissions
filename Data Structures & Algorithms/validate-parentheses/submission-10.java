class Solution {
    public boolean isValid(String s) {
        Stack<Character>stk=new Stack<>();
        char[]ch=s.toCharArray();
        int i=0;
        for(i=0;i<ch.length;i++)
        {
            
            if(ch[i]=='(')
            {
                stk.push(')');
            }
            else if(ch[i]=='{')
            {
                stk.push('}');
            }
            else if(ch[i]=='[')
            {
                stk.push(']');
            }
            
            else if(stk.isEmpty()||stk.pop()!=ch[i])
            {
                return false;
            }
        }
        return stk.isEmpty();
        
    }
}
