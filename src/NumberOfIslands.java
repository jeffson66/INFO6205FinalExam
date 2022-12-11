public class NumberOfIslands {

    //time complexity: O(4^N) N: number of islands in the grid
    //space complexity: O(1)
    public static int countNum(String[][] grid){
        int row = grid.length;
        int col = grid[0].length;
        int numIs = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j].equals("1")){
                    numIs++;
                    calculate(i,j, grid);
                }
            }

        }
        return numIs;
    }

    public static void calculate(int row, int col, String[][] grid){
        if(row >= grid.length || col >= grid[0].length || row < 0 || col < 0){
            return;
        }

        if(grid[row][col].equals("0")){
            return;
        }
        if(grid[row][col].equals("1")){
            grid[row][col] = "0";
            calculate(row-1, col, grid);
            calculate(row, col-1, grid);
            calculate(row+1, col, grid);
            calculate(row, col+1, grid);
        }
    }
}
