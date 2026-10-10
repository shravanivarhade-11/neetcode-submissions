class Solution {
    public int calPoints(String[] operations) {
        
      Stack<Integer>stk=new Stack<>();
      for(String op:operations)
      {
         if(op.equals("+"))
         {
            int top=stk.pop();
            int newtop=stk.peek()+top;
            stk.push(top);
            stk.push(newtop);
         }
         else if(op.equals("C"))
         {
            stk.pop();
         }
         else if(op.equals("D"))
         {
            stk.push(2*stk.peek());
         }
         else
         {
            stk.push(Integer.valueOf(op));
         }
      }  
int sum=0;
      for(int num:stk)
      {
         sum+=num;
      }
      return sum;

    }
}