package leetcode.DP;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 * n=0,result =1
 * n=1 ,result = 1;
 * n =2,result =2
 */

public class climbStairs {
    public int ClimbStaris(int n){
        if(n <=1){
            return 1;
        }else if (n==2){
            return 2;
        }else {
            int[] bag = new int[n];
            bag[0] = 1;
            bag[1] = 2;
            for (int i=2;i<n;i++){
                bag[i] = bag[i-1] + bag[i-2];
            }
            return bag[n-1];
        }
    }
}
