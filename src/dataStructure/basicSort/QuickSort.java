package dataStructure.basicSort;

public class QuickSort {
    public int PARTITION(int[] num,int left,int right){
        int index = left-1;
        int number = num[right];
        for (int i =left;i<right;i++){
            if (num[i] <=number){
                index++;
                int temp = num[index];
                num[index] = num[i];
                num[i] = temp;
            }
        }
        index++;
        int temp = num[index];
        num[index] = number;
        num[right] = temp;
        return index;
    }
    public void QUICK_SORT(int[] num,int left,int right){
        if (left<right){
            int middle = PARTITION(num,left,right);
            QUICK_SORT(num,left,middle-1);
            QUICK_SORT(num,middle+1,right);
        }
    }

    //Random Partition
    public int RANDOM_PARTITION(int[] num,int left,int right){
        int index = (int) Math.random()*(right-left+1)+left;
        int temp = num[index];
        num[index] = num[right];
        num[right] = temp;
        return PARTITION(num,left,right);
    }

    public void RANDOM_QUICK_SORT(int[] num,int left,int right){
        if (left<right){
            int middle = RANDOM_PARTITION(num,left,right);
            RANDOM_QUICK_SORT(num,left,middle-1);
            RANDOM_QUICK_SORT(num,middle+1,right);
        }
    }
}
