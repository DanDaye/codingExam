import java.util.Scanner;
public class Main {
    public static class node{
        int left = 0;
        int up =0;
        node(){
        }
        node(int left,int up){
            this.left = left;
            this.up = up;
        }

        public void setLeft(int left) {
            this.left = left;
        }

        public void setUp(int up) {
            this.up = up;
        }

        public int getLeft() {
            return left;
        }

        public int getUp() {
            return up;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0){
            System.out.println(0);
        }else {

            String[] matrix = new String[n];
            for (int i=0;i<n;i++){
                matrix[i] = in.next();
            }
//        for (String s:matrix){
//            System.out.println(s);
//        }

            node[][] map = new node[n][matrix[0].length()];
            //initial
            for (int i=0;i<n;i++){
                for (int j=0;j<matrix[i].length();j++){
                    if (matrix[i].charAt(j) =='1'){
                        map[i][j] = new node(1,1);
                    }else {
                        map[i][j] = new node(0,0);
                    }
                }
            }
            for (int i=1;i<n;i++){
                for (int j=1;j<matrix[i].length();j++){
                    if (map[i][j].getLeft()==1){
                        if (map[i][j-1].getLeft()>0){
                            map[i][j].setLeft(map[i][j-1].getLeft()+1);
                        }
                        if (map[i][j].getLeft()>map[i-1][j].getLeft()){
                            map[i][j].setLeft(map[i-1][j].getLeft());
                        }
                    }
                    if (map[i][j].getUp() ==1){
                        if (map[i-1][j].getUp()>0){
                            map[i][j].setUp(map[i-1][j].getUp()+1);
                        }
                        if (map[i][j].getUp()>map[i][j-1].getUp()){
                            map[i][j].setUp(map[i][j-1].getUp());
                        }
                    }
                }
            }
            int max = 0;
            for (int i=0;i<n;i++){
                for (int j=0;j<matrix[i].length();j++){
                    int left = map[i][j].getLeft();
                    int up = map[i][j].getUp();
                    int mm;
                    if (left<up){
                        mm = left*left;
                    }else {
                        mm = up*up;
                    }
                    if (max < mm){
                        max =mm;
                    }
                }
            }
            System.out.println(max);
        }
    }
}