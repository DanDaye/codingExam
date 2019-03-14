package dataStructure.basicSort;
//插入排序
public class InsertSort {
    public void INSERT_SORT(int[] num){
        for (int  i= 1;i<num.length;i++){
            int key = num[i];
            int j = i-1;
            while (j>=0 && num[j] > key){
                num[j+1] = num[j];
                j--;
            }
            num[j+1] = key;
        }
    }
}
