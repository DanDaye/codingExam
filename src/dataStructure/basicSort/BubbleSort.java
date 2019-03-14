package dataStructure.basicSort;
//冒泡排序
public class BubbleSort {

    public void BUBBLE_SORT(int[] num){
        for (int i =0;i<num.length;i++){
            for (int j=i;j>=0;j--){
                if (num[j-1]>num[j]){
                    int temp = num[j-1];
                    num[j-1] = num[j];
                    num[j] = temp;
                }else {
                    break;
                }
            }
        }
    }
}
