class Solution {
    public int maxArea(int[] heights) {


         int hmin=0;
        int b=0;
        int area=0;
        for(int i=0;i<heights.length;i++)
        {
            for(int j=i+1;j<heights.length;j++)
            {
               if(i!=j)
               {
                 hmin=Math.min(heights[i],heights[j]);
                 b=j-i;
                 area=Math.max(area,(hmin*b));
               }
               
            }
        }

      return area;
    }
}
