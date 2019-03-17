import java.util.*;

public class StringRotation {
    public String rotateString(String A, int n, int p) {
        // write code here
        p = p%n;
        String left = A.substring(0,p+1);
        String right = A.substring(p+1);
        return right+left;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(new StringRotation().rotateString(A,n,p));
    }
}