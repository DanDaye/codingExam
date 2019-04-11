//package com.company.jibite;
//
//import java.util.Scanner;
//
//public class one {
//}
//// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] num = new int[n];
//        for (int i=0;i<n;i++){
//            num[i] = in.nextInt();
//        }
//        int[] sum = new int[n];
//        int s = 0;
//        for (int i=0;i<n;i++){
//            s +=num[i];
//            sum[i] = s;
//        }
//        int min = Integer.MAX_VALUE;
//        for (int i=1;i<n;i++){
//            for (int j=0;j<i;j++){
//                if ((sum[i]-sum[j])<min){
//                    min = (sum[i]-sum[j]);
//                }
//            }
//        }
//        System.out.println(min);
//    }
//}