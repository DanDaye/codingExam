package leetcode.DP;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 */

/**
 * 思路：
 * 情况一：没有屋子，直接返回0
 * 情况二：只有一间屋子，返回第一间屋子的值
 * 情况三：有两间屋子及以上，针对背包1，直接为num[0],针对背包2=Math.max(num[0],num[1])
 *          对于后面的每一间屋子有偷和不偷两种可能，bag[i] = Math.max(bag[i-1],nums[i]+bag[i-2]);
 */
public class rob {
    public int Rob(int[] nums) {
        if (nums==null || nums.length ==0){
            return 0;
        }else if (nums.length ==1){
            return nums[0];
        }else if (nums.length ==2){
            return Math.max(nums[0],nums[1]);
        }else {
            int[] bag = new int[nums.length];
            bag[0] = nums[0];
            bag[1] = Math.max(nums[0],nums[1]);
            for (int i=2;i<nums.length;i++){
                bag[i] = Math.max(bag[i-1],nums[i]+bag[i-2]);
            }
            return bag[nums.length-1];
        }
    }
}
