//package com.company.keda;
//
//import java.util.Scanner;
//
//public class one {
//}
//import java.io.*;
//        import java.util.*;
//        import java.text.*;
//        import java.math.*;
//        import java.util.regex.*;
//
//public class Main {
//
//
//    /*请完成下面这个函数，实现题目要求的功能
//    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
//    ******************************开始写代码******************************/
//    static String GetResult(String s) {
//        int result =0;
//        if(s.length() == 0){
//            return Integer.valueOf(result).toString();
//        }else{
//            if(s.length()%2 ==1){
//                return Integer.valueOf(s.length()).toString();
//            }else{
//                int middle = s.length()/2;
//                String left = s.substring(0,middle);
//                String right = s.substring(middle,s.length());
//                if(left.equals(new StringBuffer(right).reverse().toString())){
//                    return GetResult(left);
//                }else{
//                    return Integer.valueOf(s.length()).toString();
//                }
//            }
//        }
//    }
//    /******************************结束写代码******************************/
//
//
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        String res;
//
//        String _s;
//        try {
//            _s = in.nextLine();
//        } catch (Exception e) {
//            _s = null;
//        }
//
//        res = GetResult(_s);
//        System.out.println(res);
//    }
//}
//
