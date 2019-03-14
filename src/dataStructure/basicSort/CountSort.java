package dataStructure.basicSort;
//计数排序
public class CountSort {

    public void COUNT_SORT(int[] num, int[] result, int k){
        int[] c = new int[k];
        for (int i=0; i<k; i++){
            c[i] = 0;
        }
        for (int i =0; i<num.length; i++){
            c[num[i]]+=1;
        }
        for (int i=0; i<num.length; i++){
            c[i] += c[i-1];
        }
        for(int i=num.length-1;i>=0;i--){
            result[c[num[i]]-1] = num[i];
            c[num[i]] -= 1;
        }
    }
}
