public class SmartComputerStrategy implements MoveStrategy {
    private Symbol mySymbol;
    public SmartComputerStrategy(Symbol mySymbol) { this.mySymbol = mySymbol; }
    public Move selectMove(Board board) {
        int n = board.getN();
        // 1. can I win right now? take it.
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (board.isValid(r, c)) {
                    board.placeMove(r, c, mySymbol);        // try it
                    boolean wins = board.win(mySymbol);
                    board.undoMove(r, c);                 // take it back
                    if (wins) {
                        System.out.println("Computer plays: " + r + " " + c);
                        return new Move(r, c);
                    }
                }
            }
        }
        // 2. otherwise first available
        for (int r = 0; r < n; r++)
            for (int c = 0; c < n; c++)
                if (board.isValid(r, c)) {
                    System.out.println("Computer plays: " + r + " " + c);
                    return new Move(r, c);
                }
        return null;
    }
}
