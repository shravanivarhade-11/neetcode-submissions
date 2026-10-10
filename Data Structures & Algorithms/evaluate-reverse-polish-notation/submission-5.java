class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack=new Stack<>();
        int result=0;
        for(int i=0;i<tokens.length;i++)
        {
            String c=tokens[i];
            
            
                
                if(c.equals("+"))
                {
                    int tmp=stack.pop();
                 result=tmp+stack.pop();
                 stack.push(result);
                }
                else if(c.equals("-"))
                {int tmp=stack.pop();
                    result=stack.pop()-tmp;
                    stack.push(result);
                }
                else if(c.equals("*"))
                {int tmp=stack.pop();
                    
                    result=tmp*stack.pop();
                    stack.push(result);
                }
                else if(c.equals("/"))
                {int tmp=stack.pop();
                    result=(int)stack.pop()/tmp;
                    stack.push(result);
                    
                }
                else
                {
                    
                    int num=Integer.parseInt(c);
                 
                    stack.push(num);
                }
                
            
        }
        return stack.peek();
        
    }
}
