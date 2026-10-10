class Solution {
    public int minEatingSpeed(int[] piles, int h) {

     int l=1;
     int max=0;
     for(int i=0;i<piles.length;i++)
     {
        max=Math.max(max,piles[i]);
     }   
     int r=max;
    int mid=0;
    int hours=0;
     while(l<=r)
     {
        mid=(l+r)/2;
        hours=0;
        for(int i=0;i<piles.length;i++)
    {
        
    hours+=(int)Math.ceil((double)piles[i]/mid);
    
    }

        if(hours>h)
        {
            l=mid+1;
        }
        else 
        {
            r=mid-1;
        }
        

     }
     return l;
        
    }
}

