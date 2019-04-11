//package com.company.xiecheng;
//
//import java.util.HashSet;
//import java.util.Scanner;
//
//public class one {
//}
//// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
//import java.util.HashSet;
//        import java.util.Scanner;
//public class Main {
//    //    public static class node{
////        public String value;
////        public node next;
////        node(String value){
////            this.value = value;
////        }
////
////        public void setNext(node next) {
////            this.next = next;
////        }
////
////    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String input = in.nextLine();
//        String[] nn = input.split(",");
//        if (nn == null || nn.length==0){
//            System.out.println("false");
//        }else{
////            node head = new node(nn[0]);
////            node temp = head;
////            for (int i=1;i<nn.length;i++){
////                node tt = new node(nn[i]);
////                temp.setNext(tt);;
////                temp = tt;
////            }
//            HashSet<String> resultset = new HashSet<>();
//            boolean flag = true;
//            for (int i=0;i<nn.length;i++){
//                if (resultset.contains(nn[i])){
//                    flag = false;
//                    break;
//                }else{
//                    resultset.add(nn[i]);
//                }
//            }
//            if (flag){
//                System.out.println("false");
//            }else{
//                System.out.println("true");
//            }
//        }
//
//
//    }
//}