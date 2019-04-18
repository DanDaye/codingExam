package Sword_means_offer.two;

public class Fibonacci_10 {

    /**
     * 题目一：求斐波那契数列的第n项
     * 写一个函数，输入n,求斐波那契数列的第N项。
     * @param n
     * @return
     */
    public  long Fibonacci(int n){
        int[] result = new int[]{0,1};
        if (n<2){
            return result[n];
        }
        long one = 1;
        long two = 0;
        long fibN = 0;
        for (int i=2;i<=n;i++){
            fibN +=one+two;
            two = one;
            one = fibN;
        }
        return fibN;
    }

    public int getStep(int n){
        if (n<3){
            return n;
        }else{
            int[] step = new int[n];
            step[0] = 1;
            step[1] = 2;
            for (int i=2;i<n;i++){
                step[i] = step[i-1]+step[i-2];
            }
            return step[n-1];
        }
    }

}
