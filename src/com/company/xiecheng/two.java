//package com.company.xiecheng;
//
//import java.util.Scanner;
//
//public class two {
//}
//// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
//import java.util.HashSet;
//        import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String input = in.nextLine();
//        int k = in.nextInt();
//        if (input.length()<=2){
//            System.out.println("[]");
//        }else{
//            input = input.substring(1,input.length()-1);
//            String[] array = input.split(",");
//            if (array == null || array.length==0){
//                System.out.print("[]");
//            }else{
//                int len = array.length;
//                int rotate = k%len;
//                System.out.print("[");
//                int time = len/rotate;
////                System.out.println(time);
//                for (int i=1;i<=time;i++){
//                    for (int j=i*rotate-1;j>=(i-1)*rotate;j--){
//                        System.out.print(array[j]);
//                        if (j!=(time-1)*rotate){
//                            System.out.print(",");
//                        }
//                    }
//                }
//                for (int i = time*rotate;i<len;i++){
//                    System.out.print(",");
//                    System.out.print(array[i]);
////                    if (i!=len-1){
////
////                    }
//                }
//                System.out.print("]");
//            }
//        }
//
//    }
//}