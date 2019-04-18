package Sword_means_offer.two;

public class hasPath_12 {
    public void  initialVisit(boolean[][] visit){
        for (int i =0;i<visit.length;i++){
            for (int j =0;j<visit[0].length;j++){
                visit[i][j] = true;
            }
        }
    }
    public boolean hasPath(char[][] matrix,String path){
        if (matrix==null || matrix.length<1 || matrix[0].length<1 || path==null){
            return false;
        }else{
            boolean[][] visit = new boolean[matrix.length][matrix[0].length];
            initialVisit(visit);
            for (int i = 0;i<matrix.length;i++){
                for (int j =0;j<matrix[0].length;j++){
                    if (isHasPathCore(matrix,i,j,0,path,visit)){
                        return true;
                    }
                }
            }
            return false;
        }
    }
    public  boolean isHasPathCore(char[][] matrix,int rows,int cols,int col,String path,boolean[][] visit){
        if (rows>=0 && rows<matrix.length && cols>=0 && cols<matrix[0].length && matrix[rows][cols] == path.charAt(col) && visit[cols][rows]){
            if (col == (path.length()-1)){
                return  true;
            }else {
                visit[cols][rows] = false;
                return isHasPathCore(matrix,rows-1,cols,col+1,path,visit)|| isHasPathCore(matrix,rows+1,cols,col+1,path,visit)
                        || isHasPathCore(matrix,rows,cols-1,col+1,path,visit)|| isHasPathCore(matrix,rows,cols+1,col+1,path,visit);
            }
        }else {
            return false;
        }
    }

    public static void main(String[] args){
        char[][]  matrix = new char[][]{{'a','b','t','g'},{'c','f','c','s'},{'j','d','e','h'}};
        String path = "abfb";
        System.out.println(new hasPath_12().hasPath(matrix,path));
    }
}
