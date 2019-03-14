package dataStructure.basicSort;
//堆排序
public class StackSort {

    //堆比较修正
    public void MAX_HEAPIFY(int[] num, int i,int length){
        int left = 2*i+1;
        int right = 2*i+2;
        int largest = i;
        //比较左边是否比父结点大
        if (left<length && num[left] > num[i]){
            largest = left;
        }
        //比较右边是否是最大的结点
        if(right < length && num[right] > num[largest]){
            largest = right;
        }
        //如果父结点比其子结点小，那么交换，并对交换后的子结点进行HEAPIFY
        if (largest !=i){
            int temp = num[i];
            num[i] = num[largest];
            num[largest] = temp;
            MAX_HEAPIFY(num,largest,num.length);
        }
    }

    //建立大顶堆
    public void BUILD_MAX_HEAP(int[] num){
        //从第一个非叶子结点开始进行修正
        for (int i = (num.length/2);i>=0;i--){
            MAX_HEAPIFY(num,i,num.length);
        }
    }

    //堆排序
    public void HEAPSORT(int[] num){
        BUILD_MAX_HEAP(num);
        int heap_size = num.length;
        for (int i=num.length-1;i>=0;i--){
            int temp = num[0];
            num[0] = num[i];
            num[i] = temp;
            heap_size --;
            MAX_HEAPIFY(num,0,heap_size);
        }
    }

    //获取堆中的最大值
    public int HEAP_EXTRACT_HEAP(int[] num, int heap_size){
        if (heap_size<0){
            System.out.println("heap underflow");
            return -1;
        }else {
            int max = num[0];
            heap_size--;
            num[0] = num[heap_size];
            MAX_HEAPIFY(num,0,heap_size);
            return max;
        }
    }

    //对某一个结点的值进行改变
    public void HEAP_INCREASE_KEy(int[] num, int i, int key){
        if (key < num[i]){
            System.out.println("new key is smaller than current key");
        }else{
            num[i] = key;
            while (i>0 && num[i/2] < num[i]){
                int temp = num[i/2];
                num[i/2] = num[i];
                num[i] = temp;
                i = i/2;
            }
        }
    }
}
