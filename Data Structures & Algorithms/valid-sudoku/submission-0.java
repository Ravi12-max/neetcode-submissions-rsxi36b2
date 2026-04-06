class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch=board[i][j];
                if(ch=='.') continue;
                String inRow=ch +"in row"+i;
                String inCol=ch+"in col"+j;
                String inBox=ch+"in box"+(i/3*3 + j/3);
                if(!set.add(inRow) || !set.add(inCol) || !set.add(inBox)) return false;
            }
        }
        return true;    
    }
}
