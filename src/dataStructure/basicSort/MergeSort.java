package dataStructure.basicSort;
//归并排序
public class MergeSort {

    public void MERGE(int[] num,int left,int middle,int right){
        int[] temp = new int[right - left +1];
        int i = left;
        int j = middle+1;
        int k =0;
        while (i< middle && j<=right){
            if (num[i] < num[j]){
                temp[k++] = num[i++];
            }else {
                temp[k++] = num[j++];
            }
        }

        while (i<=middle){
            temp[k++] = num[i++];
        }
        while (j<right){
            temp[k++] = num[j++];
        }

        for (int x =0;x<temp.length;x++){
            num[x+left] = temp[x];
        }
    }

    public void MERGE_SORT(int[] num,int left,int right){
        int middle = (left+right)/2;
        if (left<right){
            MERGE_SORT(num,left,middle);
            MERGE_SORT(num,middle+1,right);
            MERGE(num,left,middle,right);
        }
    }
}
