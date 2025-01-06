public class Game {
    private Player player1;
    private Player player2;
    private Board board;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = Board.getInstance();
    }

    public void start() {
        Player currentPlayer = player1;
        boolean gameWon = false;

        while (!board.isFull() && !gameWon) {
            board.displayBoard();
            System.out.println(currentPlayer.getName() + "'s turn.");
            currentPlayer.makeMove(board);

            if (board.checkWin(currentPlayer.getMark())) {
                gameWon = true;
                board.displayBoard();
                System.out.println(currentPlayer.getName() + " wins!");
                return;
            }

            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }

        board.displayBoard();
        System.out.println("It's a draw!");
    }
}