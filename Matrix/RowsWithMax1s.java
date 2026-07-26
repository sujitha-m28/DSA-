class Solution {
    public int rowWithMax1s(int[][] arr) {
        // code here
   

        int n = arr.length;
        int m = arr[0].length;

        int i = 0;
        int j = m - 1;

        int ans = -1;

        while (i < n && j >= 0) {

            if (arr[i][j] == 1) {
                ans = i;
                j--;        // move left
            } else {
                i++;        // move down
            }
        }

        return ans;
    }
}
        
    
    

