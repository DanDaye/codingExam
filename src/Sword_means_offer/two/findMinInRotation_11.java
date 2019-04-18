package Sword_means_offer.two;

public class findMinInRotation_11 {

    public int findMin(int[] nums){
        int len = nums.length;
        int left = 0;
        int right = len-1;
        int mid = left;
        while (nums[mid] >= nums[right]){
            if (right-left==1){
                mid = right;
                break;
            }
            mid =(left+right)/2;
            if (nums[left] == nums[right] && nums[left] == nums[mid]){
                return GetMinInOrder(nums,left,right);
            }
            if (nums[mid] >=nums[right]){
                left = mid;
            }else if (nums[mid]>= nums[left]){
                right = mid;
            }
        }
        return nums[mid];
    }

    private int GetMinInOrder(int[] nums, int left, int right) {
        int result = nums[left];
        for (int i=left+1;i<=right;i++){
            if (result>nums[i]){
                result = nums[i];
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = new  int[]{4,5,6,7,1,2,3};
        System.out.println(new findMinInRotation_11().findMin(nums));
    }
}
