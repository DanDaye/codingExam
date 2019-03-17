package leetcode.DP;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 *
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 *
 *
 *
 * 网格中的障碍物和空位置分别用 1 和 0 来表示。
 *
 * 说明：m 和 n 的值均不超过 100。
 *
 * 示例 1:
 *
 * 输入:
 * [
 *   [0,0,0],
 *   [0,1,0],
 *   [0,0,0]
 * ]
 * 输出: 2
 * 解释:
 * 3x3 网格的正中间有一个障碍物。
 * 从左上角到右下角一共有 2 条不同的路径：
 * 1. 向右 -> 向右 -> 向下 -> 向下
 * 2. 向下 -> 向下 -> 向右 -> 向右
 */

//思路

/**
 * 情况一：图不存在，直接返回0
 * 情况二：只有一行或只有一列，1.行（列）中存在障碍，返回0；2.行（列）中不存在障碍，返回1
 * 情况三：1.该位置不是障碍位置，该位置到达的路径数等于上边到达的路径数加上左边到达的路径数
 *          2.该位置是障碍位置，到达该位置的路径数为0
 *
 * 返回为最右边的图位置到达的路径数
 */
public class uniquePathsWithObstacles {
        public int UniquePathsWithObstacles(int[][] obstacleGrid) {
            int n = obstacleGrid.length;
            if (n!=0){
                int m = obstacleGrid[0].length;
                if (m!=0){
                    int[][] map = new int[n][m];
                    //初始化第一行
                    for (int i=0;i<m;i++){
                        if (obstacleGrid[0][i] !=1){
                            map[0][i] =1;
                        }else {
                            break;
                        }
                    }

                    //初始化第一列
                    for (int i=0;i<n;i++){
                        if (obstacleGrid[i][0] !=1){
                            map[i][0] =1;
                        }else {
                            break;
                        }
                    }
                    if(n==1 || m==1){
                        return map[n-1][m-1];
                    }
                    //对于每一个格子
                    for (int i=1;i<n;i++){
                        for (int j =1;j<m;j++){
                            if (obstacleGrid[i][j] != 1){
                                map[i][j] =map[i-1][j] +map[i][j-1];
                            }
                        }
                    }
                    return map[n-1][m-1];

                }else {
                    return 0;
                }
            }else {
                return 0;
            }
        }
}
