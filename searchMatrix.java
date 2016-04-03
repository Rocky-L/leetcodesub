public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = 0, row = 0;

        while (row < matrix.length) {
            if (matrix[row][col] > target) {
                row += 1;
                col = 0;
            } else if (matrix[row][col] == target){
                return true;
            } else if (col == matrix[0].length - 1) {
                row += 1;
                col = 0;
            } else {
                col++;
            }
        }
        return false;
    }
}