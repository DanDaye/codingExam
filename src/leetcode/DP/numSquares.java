package leetcode.DP;

/**
 * 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
 *
 * 示例 1:
 *
 * 输入: n = 12
 * 输出: 3
 * 解释: 12 = 4 + 4 + 4.
 * 示例 2:
 *
 * 输入: n = 13
 * 输出: 2
 * 解释: 13 = 4 + 9.
 */
public class numSquares {
    public int NumSquares(int n){
        int[] nums = new int[n+1];
        nums[0] =0;
        nums[1] = 1;
        for (int i=2;i<=n;i++){
            int tmp = Integer.MAX_VALUE;
            for (int j=1;j*j <=i;j++){
                tmp = Math.min(tmp,nums[i-j*j]);
            }
            nums[i] = tmp+1;
        }
        return nums[n];
    }
}
