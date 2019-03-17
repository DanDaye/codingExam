package com.company.Sangfor;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class one {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String str = in.next();
            str =str.toLowerCase();
            char[] c = str.toCharArray();
            if (str.length()<3){
                System.out.println(0);
            }else {
                HashMap<Character,Integer> has = new HashMap<>();
                String s1 = "[a-zA-Z]+";
                char temp='0';
                for (int i=0;i<c.length;i++){
                    CharSequence cd = str.subSequence(i,i+1);
                    if (Pattern.matches(s1,cd)){
                        if (has.containsKey(str.charAt(i))){
                            has.put(str.charAt(i),has.get(str.charAt(i))+1);
                            if (has.get(str.charAt(i))==3){
                                temp = str.charAt(i);
                                break;
                            }
                        }else {
                            has.put(str.charAt(i),1);
                        }
                    }
                }
                if (temp!='0'){
                    System.out.println(temp-'a'+1);
                }else {
                    System.out.println(0);
                }
            }
        }
}
