package leetcode.DP;

/**
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 *
 * 说明：每次只能向下或者向右移动一步。
 *
 * 示例:
 *
 * 输入:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 *
 */
//要判断图表是否存在
public class minPathSum {
    public int MinPathSum(int[][] grid){
        if (grid != null && grid.length > 0 && grid[0].length > 0) {
            int[][] sum = new int[grid.length][grid[0].length];
            sum[0][0] = grid[0][0];
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (i == 0 && j == 0) {
                        continue;
                    } else if (i == 0) {
                        sum[i][j] = grid[i][j] + sum[i][j - 1];
                    } else if (j == 0) {
                        sum[i][j] = grid[i][j] + sum[i - 1][j];
                    } else {
                        sum[i][j] = grid[i][j] + Math.min(sum[i - 1][j], sum[i][j - 1]);
                    }
                }
            }
            return sum[grid.length - 1][grid[0].length - 1];
        } else {
            return 0;
        }
    }
}
