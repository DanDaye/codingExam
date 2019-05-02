//import java.util.HashSet;
//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        HashSet<String> set = new HashSet<>();
//        for (int i=0;i<m;i++){
//            String s =sc.next();
//            set.add(s);
//        }
//        String T = sc.next();
//        int len = T.length();
//        int[] hole = new int[len];
//        if (set.contains(T.charAt(0)+"")){
//            hole[0]=1;
//        }else{
//            hole[0] = 0;
//        }
//        for (int i=1;i<len;i++){
//            hole[i] = 0;
//            String sublen = T.charAt(i)+"";
//            for (int j=i;j>=0;j--){
//                sublen = T.charAt(j)+sublen;
//                if (set.contains(sublen)){
//                    if ((j-1)>=0) {
//                        hole[i] = Math.max(hole[i], 1 + hole[j - 1]);
//                    }else{
//                        hole[i] =1;
//                    }
//                }
//            }
//            hole[i] = Math.max(hole[i],hole[i-1]);
//        }
//        System.out.println(hole[len-1]);
//    }
//}