public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length, cols = obstacleGrid[0].length;
        if(rows == 0 || cols == 0) return 0;
        obstacleGrid[rows-1][cols-1] = obstacleGrid[rows-1][cols-1] == 0 ? 1:0;
        for (int i = rows-2; i >= 0; i--) obstacleGrid[i][cols-1] = obstacleGrid[i][cols-1] == 0 ? obstacleGrid[i+1][cols-1]:0;
        for(int j = cols-2; j >= 0; j--) obstacleGrid[rows-1][j] = obstacleGrid[rows-1][j]==0 ? obstacleGrid[rows-1][j+1]:0;
        for(int i = rows-2; i >= 0; i--){
            for(int j = cols-2; j >= 0; j--){
                if (obstacleGrid[i][j] == 1) obstacleGrid[i][j] = 0;
                else obstacleGrid[i][j] = obstacleGrid[i+1][j] + obstacleGrid[i][j+1];
            }
        }
        return obstacleGrid[0][0];
    }
}