package com.company.mihayou;

import java.util.Scanner;

public class sameBucket {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] num = new int[n][2];
        int begin = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            num[i][0] = sc.nextInt();
            num[i][1] = sc.nextInt();
            if (begin > num[i][0]){
                begin = num[i][0];
            }
            if (end< num[i][1]){
                end = num[i][1];
            }
        }
        if (begin<0){
            begin = 0;
        }
        if (end<0){
            end =0;
        }
        int[] bucket = new int[end-begin+1];
        for (int i=0;i<n;i++){
            for (int j=num[i][0];j<num[i][1];j++){
                bucket[j-begin] ++;
            }
        }
        int result =0;
        for (int i=0;i<bucket.length;i++){
            if (result<bucket[i]){
                result = bucket[i];
            }
        }
        System.out.println(result);

    }
}
