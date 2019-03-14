package com.company.huawei;

import java.util.Scanner;

public class one {
        public static String toBinary(int num){
            String result = "";
            while (num!=0){
                int temp = num%2;
                num = num/2;
                result = temp + result;
            }
            int between = 8-result.length();
            for (int i=0;i<between;i++){
                result = "0" + result;
            }
            return result;
        }


        public static String bitAnd(String s1,String s2){
            String result = "";
            for (int i=0;i<8;i++){
                if (s1.charAt(i) == '1' && s2.charAt(i)=='1'){
                    result = result +'1';
                }else {
                    result = result +'0';
                }
            }
            return result;

        }

        public static int binaryToInt(String s){
            int result =0;
            for (int i=0;i<8;i++){
                if (s.charAt(i) =='1'){
                    int t = (int)Math.pow(2,(8-i-1));
                    result = result+t;

                }
            }
            return result;
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String ip1,ip2,yanma;
            ip1=in.next();
            ip2 = in.next();
            yanma = in.next();
            String[] i1 = ip1.split("\\.");
            String[] i2 = ip2.split("\\.");
            String[] y = yanma.split("\\.");
            boolean flag = true;
            String ipp="";
            for (int i=0;i<4;i++){
                i1[i] = toBinary(Integer.valueOf(i1[i]));
                i2[i] = toBinary(Integer.valueOf(i2[i]));
                y[i] = toBinary(Integer.valueOf(y[i]));
                String ii1 = bitAnd(i1[i],y[i]);
                String ii2 = bitAnd(i2[i],y[i]);
                if (!ii1.equals(ii2)){
                    flag=false;
                }
                int t = binaryToInt(ii1);
                if (i!=3){
                    ipp =ipp+ t+".";
                }else {
                    ipp +=t;
                }
            }
            if (flag){
                System.out.println("1 "+ipp);
            }else {
                System.out.println("0 "+ipp);
            }

        }
}
