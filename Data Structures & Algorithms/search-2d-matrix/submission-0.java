class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int l = 0, r = m - 1, col, row;
        while(l <= r){
            row = l + ((r-l) / 2);
            if(matrix[row][0] > target){
                r = row - 1;
            }
            else if(target > matrix[row][n - 1]){
                l = row + 1;
            }
            else{
                l = 0; r = n - 1;
                while(l <= r){
                    col = l + ((r-l) / 2);
                    if(matrix[row][col] > target){
                        r = col - 1;
                    }
                    else if(target > matrix[row][col]){
                        l = col + 1;
                    }        
                    else return true;
                }
                return false;
            }
        }
        return false;
    }
}
