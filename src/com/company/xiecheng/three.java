//package com.company.xiecheng;
//
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class three {
//}
//
//// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
//import java.util.HashMap;
//        import java.util.HashSet;
//        import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        if (n == 0){
//            System.out.println();
//        }else{
//            String[] array = new String[n];
//            for (int i=0;i<n;i++){
//                array[i] = in.next();
//            }
//            HashMap<String,Integer> map = new HashMap<>();
//            int time =1;
//            for (int i=0;i<array.length;i++){
//                time =1;
//                if (array[i].charAt(array[i].length()-1)=='/'){
//                    array[i] = array[i].substring(0,array[i].length()-1);
//                }
//                if (map.containsKey(array[i])){
//                    time = map.get(array[i])+1;
//                    map.put(array[i],time);
//                }else{
//                    map.put(array[i],time);
//                }
//                String[] str = array[i].split("/");
//                for (int j=0;j<str.length;j++){
//                    if (j==0){
//                        continue;
//                    }else if (j==1 || j==str.length-1){
//                        System.out.print("1");
//                    }else{
//                        System.out.print(time);
//                    }
//                }
//                if (i!=array.length-1){
//                    System.out.print(" ");
//                }
//            }
//        }
//
//    }
//}