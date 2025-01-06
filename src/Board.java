public class Board {
    private static Board instance;
    private char[][] board;
    private static final int SIZE = 3;

    private Board() {
        board = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static Board getInstance() {
        if (instance == null) {
            instance = new Board();
        }
        return instance;
    }

    public void displayBoard() {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public boolean placeMark(int row, int col, char mark) {
        if (row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == '-') {
            board[row][col] = mark;
            return true;
        }
        return false;
    }

    public boolean checkWin(char mark) {
        for (int i = 0; i < SIZE; i++) {
            if (checkRow(i, mark) || checkColumn(i, mark)) return true;
        }
        return checkDiagonals(mark);
    }

    private boolean checkRow(int row, char mark) {
        for (int j = 0; j < SIZE; j++) {
            if (board[row][j] != mark) return false;
        }
        return true;
    }

    private boolean checkColumn(int col, char mark) {
        for (int i = 0; i < SIZE; i++) {
            if (board[i][col] != mark) return false;
        }
        return true;
    }

    private boolean checkDiagonals(char mark) {
        boolean diagonal1 = true, diagonal2 = true;
        for (int i = 0; i < SIZE; i++) {
            diagonal1 &= (board[i][i] == mark);
            diagonal2 &= (board[i][SIZE - i - 1] == mark);
        }
        return diagonal1 || diagonal2;
    }

    public boolean isFull() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == '-') return false;
            }
        }
        return true;
    }
}