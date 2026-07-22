class SearchElement{
    public static boolean matSearch(int mat[][], int x) {
        // code here
        

        int rows = mat.length;
        int cols = mat[0].length;

        int i = 0;
        int j = cols - 1;

        while (i < rows && j >= 0) {

            if (mat[i][j] == x) {
                return true;
            }

            else if (mat[i][j] > x) {
                j--;        // Move Left
            }

            else {
                i++;        // Move Down
            }
        }

        return false;
    

    }
}
