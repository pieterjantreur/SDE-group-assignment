public class Main {
    public static void main(String[] args) {
        Player player1 = new HumanPlayer("Player 1", 'X');
        Player player2 = new HumanPlayer("Player 2", 'O');

        Game game = new Game(player1, player2);
        game.start();
    }
}