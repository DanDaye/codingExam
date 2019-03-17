package leetcode.DP;

/**
 * 一条包含字母 A-Z 的消息通过以下方式进行了编码：
 *
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * 给定一个只包含数字的非空字符串，请计算解码方法的总数。
 *
 * 示例 1:
 *
 * 输入: "12"
 * 输出: 2
 * 解释: 它可以解码为 "AB"（1 2）或者 "L"（12）。
 * 示例 2:
 *
 * 输入: "226"
 * 输出: 3
 * 解释: 它可以解码为 "BZ" (2 26), "VF" (22 6), 或者 "BBF" (2 2 6) 。
 *
 *
 */

/**
 * 整体思路：
 * 如果当前位为0：
 * 如果前一位不是1或2，则这个0无法和任何数组成字母，代表整个串无法构成编码
 * 如果前一位是1或者2，则说明前一位和当前位能组成字母，这时候能构成的编码数目是和前前位相同的，即：dp[i] = dp[i-2]
 * 如果当前位不为0：
 * 如果前一位和当前位能组成字母，则当前位的构成编码数目应该为前一位和前前位之和，即：dp[i] = dp[i-1] + dp[i-2]，当然要考虑当前位是否符合i>=2?
 * 如果前一位和当前位不能组成字母，则当前位单独组成字母，即dp[i] = dp[i-1]
 */
public class numDecodings {
    public int NumDecodings(String s) {
        if (s == null || s.length()==0 ){
            return 0;
        }
        if (s.charAt(0) =='0'){
            return 0;
        }
        if (s.length() == 1){
            return 1;
        }
        int[] nums = new int[s.length()+1];
        nums[0] = 1;
        nums[1] =1;
        char[] str = s.toCharArray();
        for (int i=1;i<s.length();i++){
            if (str[i] =='0'){
                if (str[i-1] =='1' || str[i-1] =='2')
                    nums[i+1] = nums[i-1];
                else
                    return 0;
            }else if (str[i-1] =='1' ||(str[i-1]=='2' && str[i] <='6')){
                nums[i+1] = nums[i] + nums[i-1];
            }else
                nums[i+1] = nums[i];
        }
        return nums[s.length()];

    }
}
