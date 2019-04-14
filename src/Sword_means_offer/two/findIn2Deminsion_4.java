package Sword_means_offer.two;

/**
 * 题目：
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 */


public class findIn2Deminsion_4 {
    public boolean find(int[][] matrix,int num){
        if (matrix==null ||matrix.length==0 || matrix[0].length ==0){
            return false;
        }else {
            int rows = matrix.length;
            int columns = matrix[0].length;
            int row =0;
            int column = columns-1;
            while (row<rows && column>=0){
                if (matrix[row][column]==num){
                    return true;
                }else if (matrix[row][column] >num){
                    column--;
                }else {
                    row++;
                }
            }
            return false;
        }
    }
}
