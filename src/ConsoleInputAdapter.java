import java.util.Scanner;

public class ConsoleInputAdapter implements InputAdapter {
    private Scanner scanner;

    public ConsoleInputAdapter() {
        scanner = new Scanner(System.in);
    }

    @Override
    public int[] getMove() {
        System.out.println("Enter row and column (separated by space): ");
        return new int[] { scanner.nextInt(), scanner.nextInt() };
    }
}