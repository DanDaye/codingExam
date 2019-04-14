package Sword_means_offer.two;

import java.util.Arrays;

public class replaceBlank_5 {

    public String replaceBlack(char[] str){
        if (str==null || str.length==0){
            return "";
        }else {
            int len = str.length;
            int count =0;
            for (int i=0;i<len;i++){
                if (str[i]==' '){
                    count++;
                }
            }
            int len1 = len+count*2;
            int index1 = len-1;
            int index2 = len1-1;
            char[] narr = new char[len1];
            while (index1>=0 && index2>=0){
                if (str[index1]==' '){
                    narr[index2] ='0';
                    index2--;
                    narr[index2] ='2';
                    index2--;
                    narr[index2] ='%';
                    index2--;
                    index1--;
                }else{
                    narr[index2] = str[index1];
                    index1--;
                    index2--;
                }
            }
            return Arrays.toString(narr);
        }
    }
//    public static void main(String[] args){
//        char[] str = new char[]{'W','e',' ','a','r','e',' ','h','a','p','p','y'};
//        System.out.println(new replaceBlank_5().replaceBlack(str));
//    }
}
