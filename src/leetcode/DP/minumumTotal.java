package leetcode.DP;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 *
 * 例如，给定三角形：
 *
 * [
 *      [2],
 *     [3,4],
 *    [6,5,7],
 *   [4,1,8,3]
 * ]
 * 只能向下走或向右下走
 */

public class minumumTotal {

    public int MinumumTotal(List<List<Integer>> triangle) {
        int[] sum = new int[triangle.size()];
        if (triangle.size()==0){
            return 0;
        }else if (triangle.size() ==1){
            return triangle.get(0).get(0);
        }else{
            sum[0] = triangle.get(0).get(0);
//            System.out.println(sum[0]);
            for (int i=1;i<triangle.size();i++){
                List<Integer> line = triangle.get(i);
                int[] temp = new int[line.size()];
                for (int j=0;j<line.size();j++){
                    int t = line.get(j);
                    if (j==0){
                        temp[j] = sum[j] +t;
                    }else if (j==(line.size()-1)){
                        temp[j] = sum[j-1]+t;
                    }else {
                        if (sum[j-1] >sum[j]){
                            temp[j] = sum[j]+t;
                        }else {
                            temp[j] = t+sum[j-1];
                        }
                    }

                }
                sum = temp;
//                for (int j=0;j<line.size();j++){
//                    System.out.print(sum[j]+" ");
//                }
//                System.out.println();
            }
            int min = Integer.MAX_VALUE;
            for (int i=0;i<triangle.size();i++){
                if (min>sum[i]){
                    min=sum[i];
                }
            }
            return min;
        }
    }

    public static void main(String[] args){
        List<Integer> one = new ArrayList<>();
        one.add(2);
        List<Integer> two = new ArrayList<>();
        two.add(3);two.add(4);
        List<Integer> three = new ArrayList<>();
        three.add(6);
        three.add(5);
        three.add(7);
        List<Integer> four = new ArrayList<>();
        four.add(4);
        four.add(1);
        four.add(8);
        four.add(3);
        List<List<Integer>> r = new ArrayList<>();
        r.add(one);
        r.add(two);
        r.add(three);
        r.add(four);

    }
}
