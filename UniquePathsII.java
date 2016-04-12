public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length, cols = obstacleGrid[0].length;
        if(rows == 0 || cols == 0) {return 0;}

        for(int i = rows-1; i >= 0; i--){
            for(int j = cols-1; j >= 0; j--){
                if(i == rows-1 && j == cols-1 && obstacleGrid[i][j] == 0) {obstacleGrid[i][j] = 1;}
                else if (obstacleGrid[i][j] == 1) {obstacleGrid[i][j] = 0;}
                else if (i == rows-1 && obstacleGrid[i][j] == 0) {obstacleGrid[i][j] = obstacleGrid[i][j+1];}
                else if (j == cols-1 && obstacleGrid[i][j] == 0) {obstacleGrid[i][j] = obstacleGrid[i+1][j];}
                else {obstacleGrid[i][j] = obstacleGrid[i+1][j] + obstacleGrid[i][j+1];}
            }
        }
        return obstacleGrid[0][0];
    }
}