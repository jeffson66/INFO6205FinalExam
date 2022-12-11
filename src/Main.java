import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        //1
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        String[] strs1 ={"a"};
        String[] strs2 = {""};
        List<List<String>> list = GroupAnagram.group(strs1);
       for(List<String> li: list){
           for(String str: li){
               System.out.print(str+",");
           }
           System.out.println();
       }       //2
        String[][] grid = {{"1", "1", "0", "0", "0"},
                {"1", "1", "0", "0", "0"},
                {"0", "0", "1", "0", "0"},
                {"0", "0", "0", "1", "1"}};
        int n = NumberOfIslands.countNum(grid);
        System.out.println("number of islands: " + n);
        //3
        String res = RemoveMinParen.remove("lee(t(c)o)de)");
        String res1 = RemoveMinParen.remove("()))");
        System.out.println("String after removal: " + res1);
        //4
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        int[][] obstacleGrid2 = {{0,1},{0,0}};
        int num = Obstacle.uniquePath(obstacleGrid2);
        System.out.println("number of unique paths: " + num);
    }
}
