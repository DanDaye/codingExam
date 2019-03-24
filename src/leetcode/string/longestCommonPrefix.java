package leetcode.string;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 */

public class longestCommonPrefix {

    public String compare(String str1,String str2){
        String result ="";
        int len = Math.min(str1.length(),str2.length());
        for (int i=0;i<len;i++){
            if (str1.charAt(i) == str2.charAt(i)){
                result +=str1.charAt(i);
            }else {
                break;
            }
        }
        return result;
    }
    public String LongestCommonPrefix(String[] strs) {
        if (strs==null|| strs.length==0){
            return "";
        }else if (strs.length==1){
            return strs[0];
        }else {
            String temp = strs[0];
            for (int i=1;i<strs.length;i++){
                temp = compare(temp,strs[i]);
            }
            return temp;
        }
    }
}
