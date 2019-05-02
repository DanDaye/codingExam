//package com.company.jindong;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Scanner;
//
//public class two {
//}
//
//
//import java.util.*;
//
//public class Main{
//    public static lNode getDeepNode(lNode node){
//        if (node.deep==0){
//            return null;
//        }else{
//            lNode n = null;
//            int max = Integer.MIN_VALUE;
//            for (lNode nn:node.nodelist){
//                if (nn.deep>max){
//                    max = nn.deep;
//                    n = nn;
//                }
//            }
//            return n;
//        }
//    }
//    public static int getNode(lNode node){
//        if (node.deep ==0){
//            return  1;
//        }else{
//            int result = 1;
//            for (lNode n:node.nodelist){
//                result +=getNode(n);
//            }
//            return result;
//        }
//    }
//    public static int partition(int[] num,int left,int right){
//        int index = left-1;
//        int key = num[right];
//        for (int i=left;i<right;i++){
//            if (num[i]<=key){
//                index++;
//                int temp =num[index];
//                num[index] = num[i];
//                num[i] = temp;
//            }
//        }
//        index++;
//        int temp =num[index];
//        num[index] = num[right];
//        num[right] = temp;
//        return index;
//    }
//    public static void sort(int[] num,int left,int right){
//        if (left<right){
//            int middle = partition(num,left,right);
//            sort(num,left,middle-1);
//            sort(num,middle+1,right);
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        HashMap<Integer, lNode> map = new HashMap<>();
//        for (int i=0;i<n-1;i++){
//            int n1 = sc.nextInt();
//            int n2 = sc.nextInt();
//            if (map.containsKey(n2)){
//                lNode ln = map.get(n2);
//                if (map.containsKey(n1)){
//                    ln.nodelist.add(map.get(n1));
//                    ln.deep++;
//                }else{
//                    lNode nn = new lNode(n1);
//                    map.put(n1,nn);
//                    ln.nodelist.add(nn);
//                    ln.deep++;
//                }
//            }else{
//                lNode root = new lNode(n2);
//                map.put(n2,root);
//                if (map.containsKey(n1)){
//                    root.nodelist.add(map.get(n1));
//                    root.deep++;
//                }else{
//                    lNode nn = new lNode(n1);
//                    map.put(n1,nn);
//                    root.nodelist.add(nn);
//                    root.deep++;
//                }
//            }
//        }
//        int len = map.get(1).deep;
//        int[] num = new int[len];
//        int index = 0;
//        for (lNode node:map.get(1).nodelist){
//            num[index] = getNode(node);
//            index++;
//        }
//        sort(num,0,len-1);
//        int result =0;
//        if (len==1){
//            System.out.println(num[0]);
//        }else {
//            for (int i=1;i<len;i++){
//                if (num[i-1]==0){
//                    continue;
//                }else if (num[i] >= num[i-1]){
//                    result +=num[i-1];
//                    num[i] -=num[i-1];
//                }
//            }
//            if (num[len]!=0){
//                result+=num[len-1];
//            }
//            System.out.println(result);
//        }
//    }
//}
//class lNode{
//    int val;
//    List<lNode> nodelist;
//    int deep;
//    lNode(int val){
//        this.val = val;
//        nodelist = new ArrayList<>();
//        deep =0;
//    }
//}
