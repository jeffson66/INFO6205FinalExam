public class Obstacle {
    public static int uniquePath(int[][] grid){
        //time complexity: O(mn) m:length of row, n: length of col
        //space complexity: O(1)
        int row = grid.length;
        int col = grid[0].length;
        if(grid[0][0] == 1){
            return 0;
        }else{
            grid[0][0] = 1;
        }
        for(int i = 1; i < row; i++){
            if(grid[i][0] == 0){
                grid[i][0] = 1;
            }else{
                grid[i][0] = 0;
            }
        }

        for(int j = 1; j < col; j++){
            if(grid[0][j] == 0){
                grid[0][j] = 1;
            }else{
                grid[0][j] = 0;
            }

        }
        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(grid[i][j] == 1){
                    grid[i][j] = 0;
                }else{
                    grid[i][j] = grid[i-1][j] + grid[i][j-1];
                }
            }

        }
        return grid[row-1][col-1];
    }
}
