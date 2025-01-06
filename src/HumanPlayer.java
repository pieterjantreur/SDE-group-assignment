import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer(String name, char mark) {
        super(name, mark);
        scanner = new Scanner(System.in);
    }

    @Override
    public void makeMove(Board board) {
        int row, col;
        boolean validMove;
        do {
            System.out.println(name + " (" + mark + "), enter your move (row and column): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            validMove = board.placeMark(row, col, mark);
            if (!validMove) {
                System.out.println("Invalid move! Try again.");
            }
        } while (!validMove);
    }
}
