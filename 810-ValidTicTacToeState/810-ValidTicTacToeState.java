// Last updated: 12/08/2026, 11:46:00
class Solution {
    public boolean validTicTacToe(String[] board) {
        int xCount = 0, oCount = 0;
        for (String row : board) {
            for (char c : row.toCharArray()) {
                if (c == 'X') xCount++;
                if (c == 'O') oCount++;
            }
        }

        if (oCount > xCount || xCount - oCount > 1) return false;

        boolean xWin = win(board, 'X');
        boolean oWin = win(board, 'O');

        if (xWin && oWin) return false;
        if (xWin && xCount != oCount + 1) return false;
        if (oWin && xCount != oCount) return false;

        return true;
    }

    private boolean win(String[] board, char player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i].charAt(0) == player &&
                board[i].charAt(1) == player &&
                board[i].charAt(2) == player) return true;
        }
        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0].charAt(j) == player &&
                board[1].charAt(j) == player &&
                board[2].charAt(j) == player) return true;
        }
        // Check diagonals
        if (board[0].charAt(0) == player &&
            board[1].charAt(1) == player &&
            board[2].charAt(2) == player) return true;

        if (board[0].charAt(2) == player &&
            board[1].charAt(1) == player &&
            board[2].charAt(0) == player) return true;

        return false;
    }
}
