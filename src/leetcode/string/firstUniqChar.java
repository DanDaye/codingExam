package leetcode.string;

import java.util.HashMap;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 案例:
 *
 * s = "leetcode"
 * 返回 0.
 *
 * s = "loveleetcode",
 * 返回 2.
 */

public class firstUniqChar {
    public int FirstUniqChar(String s) {
        int result = Integer.MAX_VALUE;
        if (s == null || s.length() ==0){
            return -1;
        }
        class node{
            int value;
            int index;
            node(int value,int index){
                this.value = value;
                this.index = index;
            }
        }
        HashMap<Character,node> contains = new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (contains.containsKey(s.charAt(i))){
                node n = contains.get(s.charAt(i));
                contains.put(s.charAt(i),new node(n.value+1,n.index));
            }else {
                node n = new node(1,i);
                contains.put(s.charAt(i),n);
            }
        }
        for (Character key:contains.keySet()){
            node n = contains.get(key);
            if (n.value ==1){
                if (result > n.index){
                    result  = n.index;
                }
            }
        }
        if (result!=Integer.MAX_VALUE){
            return result;
        }else {
            return -1;
        }
    }
}
