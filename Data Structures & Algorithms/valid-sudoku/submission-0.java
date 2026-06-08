class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] boxCount = new HashSet[9];
        HashSet<Character> rowCount = new HashSet<>();

for (int i = 0; i < 9; i++) {
    boxCount[i] = new HashSet<>();
}

        for(int i = 0; i < 9; i++){
            rowCount = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    if(rowCount.contains(board[i][j]))
                        return false;
                    rowCount.add(board[i][j]);
                }
            }
        }

        for(int i = 0; i < 9; i++){
            rowCount = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[j][i] != '.'){
                    if(rowCount.contains(board[j][i]))
                        return false;
                    rowCount.add(board[j][i]);
                }
            }
        }

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    if(boxCount[j / 3 + (i/3) * 3 ].contains(board[i][j]))
                        return false;
                    boxCount[j / 3].add(board[i][j]);
                }
            }
        }
        return true;
    }
}
