public abstract class Player {
    protected String name;
    protected char mark;

    public Player(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public char getMark() {
        return mark;
    }

    public abstract void makeMove(Board board);
}