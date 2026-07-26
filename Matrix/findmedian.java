class Solution {
    public int findmedian(int[][] mat) {
        // code here
        int r=mat.length;
        int c=mat[0].length;
        
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        
        for(int i=0;i<r;i++)
        {
            low=Math.min(low,mat[i][0]);
            high=Math.max(high,mat[i][c-1]);
        }
        
        int req=(r*c+1)/2;
        
        while(low<high)
        {
            int mid=low+(high-low)/2;
            int count=0;
            
            for(int i=0;i<r;i++)
            {
                count+=upperBound(mat[i],mid);
            }
            if(count<req)
            {
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
    static int upperBound(int[] row,int target)
    {
        int low=0;
        int high=row.length;
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(row[mid]<=target)
            {
                low=mid+1;
            }
            else{
                high=mid;
            }
           
        }
         return low;
    }
}
