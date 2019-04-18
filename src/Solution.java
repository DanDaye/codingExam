import java.util.*;

/**
 * 求最大字典序子数组算法：
 *此算法用来求解最大子数
 * 一般性问题描述为：有一个数组【a0,a1,...,an]，其中，ai是0~9的整数。
 * 需要我们拿出k个数，按照原数组的顺序来组合成一个数
 * 使得：此数的值或者此数组的字典序最大化
 */
class Solution {

    /**
     * 利用一个栈，因为尽可能高位要放更大的数，所有应按照递减顺序来存放，也就是说递减栈用法
     * 如果最终结果得到的栈的大小，不能构成K位数组，那么需要一个变量来限制弹出个数
     * 如果最终得到的栈过大，我们取前K个数
     */

    public int[] submax(int[] numx,int subk){
        if (subk>numx.length|| subk==0){
            return null;
        }
        if (subk==numx.length)
            return numx;
        int[] subre = new int[subk];
        int left =0,right = numx.length-subk;
        for (int i=0;i<subk;i++){
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int j = left;j<right;j++){
                if (max<numx[j]){
                    max = numx[j];
                    maxIndex=j;
                }
            }
            if (maxIndex!=-1){
                subre[i] = max;
                left=maxIndex+1;
                right++;
            }
        }
        return subre;
    }
    public int[] merge(int[] nums1, int[] nums2, int k) {
        if (k<=0 ){
            return null;
        }else if (nums1==null|| nums2==null){
            return nums1==null?nums2:nums1;
        } else{
            int[] result = new int[k];
            int index1= 0;
            int index2 = 0;
            int len1 = nums1.length;
            int len2 = nums2.length;
            int i =0;
            while (index1<len1 && index2 < len2 && i<k){
                if (nums1[index1]>=nums2[index2]){
                    result[i] = nums1[index1];
                    i++;
                    index1++;
                }else{
                    result[i] = nums2[index2];
                    i++;
                    index2++;
                }
            }
            if (i== k){
                return result;
            }else if (index1<len1){
                for (;i<k;i++){
                    result[i] = nums1[index1];
                    index1++;
                }
            }else if (index2<len2){
                for (;i<k;i++){
                    result[i] = nums2[index2];
                    index2++;
                }
            }
            return result;
        }
    }

    public int[] maxNumber(int[] nums1, int[] nums2, int k){
        int[] re = new int[k];
        if (nums1==null && nums2!= null && nums2.length>=k){
            return submax(nums2,k);
        }else if (nums1!=null && nums1.length>=k && nums2==null){
            return submax(nums1,k);
        }else{
            for (int i=0;i<=k && i<nums1.length;i++){
                int[] sub1 = submax(nums1,i);
                int[] sub2 = submax(nums2,k-i);
                int[] merge = merge(sub1,sub2,k);
                if (compareIntList(merge,re)){
                    System.arraycopy(merge,0,re,0,k);
                }
            }
            return re;
        }
    }

    private boolean compareIntList(int[] merge, int[] re) {
        for (int i=0;i<merge.length;i++){
            if (merge[i]== re[i]){
                continue;
            }else if (merge[i]>re[i]){
                return true;
            }else {
                return  false;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums1 = new int[]{3,4,6,5};
        int[] nums2 = new int[]{9,1,2,5,8,3};
        int[] result = new Solution().maxNumber(nums1,nums2,5);
        for (int i:result){
            System.out.println(i);
        }
    }
}