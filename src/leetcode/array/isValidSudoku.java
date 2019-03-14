package leetcode.array;

/**
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 *
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 */

public class isValidSudoku {

    public boolean isValid(char[][] board){
        for (int i=0;i<9;i++){
            int[] row = new int[9];
            int[] col = new int[9];
            int[] cube = new int[9];

            for (int j=0;j<9;j++){
                if (board[i][j] !='.'){
                    if (row[board[i][j]-'1'] ==1){
                        return false;
                    }else {
                        row[board[i][j]-'1'] =1;
                    }
                }
                if (board[j][i]!='.'){
                    if (col[board[j][i]-'1']==1){
                        return false;
                    }else {
                        col[board[j][i]-'1']=1;
                    }
                }

                int cubeX = 3 * (i/3) + j/3;
                int cubeY = 3 * (i%3) + j%3;
                if(board[cubeX][cubeY] != '.') {
                    if(cube[board[cubeX][cubeY] - '1'] == 1) {
                        return false;
                    } else {
                        cube[board[cubeX][cubeY] - '1'] = 1;
                    }
                }
            }
        }
        return true;
    }
}
