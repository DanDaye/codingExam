//package com.company.keda;
//
//import java.util.Scanner;
//
//public class two {
//}
//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] p = new int[n];
//        for (int i=0;i<n;i++){
//            p[i] = sc.nextInt();
//        }
//        while (sc.hasNext()){
//            String mm = sc.next();
////            System.out.println(m);
//            if (mm.equals("0")){
//                break;
//            }else{
//                String miwen = sc.next();
//                int m = Integer.valueOf(mm);
//                if (miwen.length()<n){
//                    int len = n-miwen.length();
//                    for (int i=0;i<len;i++){
//                        miwen +=" ";
//                    }
//                }
//                char[] character = miwen.toCharArray();
//                char[] result = new char[n];
//                for (int i=0;i<m;i++){
//                    for (int j=0;j<n;j++){
//                        result[p[j]-1] = character[j];
//                    }
//                    character = result.clone();
//                }
//                System.out.println(String.valueOf(result));
//            }
//        }
//    }
//}