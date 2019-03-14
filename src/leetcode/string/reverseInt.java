package leetcode.string;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 */

/**
 * 思路：整数会溢出，那么找个可以保存的范围比整数大的数据类型，然后判断数据是否是否会溢出，
 * 如果会溢出，则返回0
 */
public class reverseInt {

    public int reverse(int x) {
        int a;
        long res =0;
        while (x!=0){
            a = x%10;
            x = x/10;
            res = res*10+a;
            if (res > Integer.MAX_VALUE || res <Integer.MIN_VALUE){
                return 0;
            }
        }
        return (int)res;
    }
}
