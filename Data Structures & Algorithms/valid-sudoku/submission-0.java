class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean r[][]= new boolean[9][9];
        boolean c[][]= new boolean[9][9];
        boolean box[][]= new boolean[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                int val=board[i][j]-'1';
                int boxindex=(i/3)*3+(j/3);
                if(r[i][val]||c[j][val]||box[boxindex][val]){
                    return false;
                }
           
                r[i][val] = true;
                c[j][val] = true;
                box[boxindex][val] = true;
            }
        }
        return true;

    }
}
